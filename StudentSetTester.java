import java.util.*;
import java.io.*;

public class StudentSetTester {

	// Come approccio viene utilizzato quello di leggere BENE il testo e
	// sottolineare le parti importanti, ed una volta fatto ciò
	// copiare tutto ciò che viene richiesto venga fatto dalla classe tester e
	// scriverci dei vari TODO (Vedi sotto), i quali ci ricordano
	// che quella parte di codice è ancora da terminare e provare
	public static void main(String[] args) {

		// Dopo aver copiato tutti i metodi di SortedSet in StudentSet e averli
		// modificati per rendere l'eseguibile compilabile, l'approccio
		// del prof è stato quello di non iniziare a modificare subito i metodi di
		// StudentSet, ma di creare il costruttore e poi iniziare a scrivere
		// la calsse tester, per poi andare a modificare StudentSet quando sulla classe
		// testere è necessario un metodo di quella classe.

		// I metodi come isEmpty, makeEmpity, toArray, toString e size si possono fare
		// fin da subito visto che sono molto semplici e "regalano" punti
		// preziosi

		// I metodi come resize, si consiglia di farli solo se si ha del tempo alla
		// fine, in quanto non necessari o comunque
		// complessi da implementare

		// prestare particolare attenzione alla complessità richiesta in certi
		// algoritmi, perchè se rispettata vale molti punti

		// L'importante è salvare, compilare ed eseguire MOLTO SPESSO, ogni qual volta
		// che terminiamo un punto di classe tester come minimo

		// TODO:

		// 1. riceve un nome di file di testo, file, come argomento sulla riga di
		// comando;

		if (args.length != 1) {
			System.out.println("Formato input non valido");
			System.exit(1);
		}

		String filename = args[0];

		// 2. crea un oggetto matricole di tipo StudentSet e vi inserisce coppie lette
		// dal file file (scritto nello stesso formato specificato pi`u sopra per il
		// metodo toString di StudentSet); al termine dell’inserimento stampa a standard
		// output il contenuto dell’insieme matricole;

		SortedSet matricole = new StudentSet();

		Scanner filescan = null;

		try {
			filescan = new Scanner(new FileReader(filename));

		} catch (IOException e) {
			System.out.println("Errore nell'apertura del file");
			return;
		}

		String cognome;
		String nome;
		int matricola;
		while (filescan.hasNextLine()) {
			String line = filescan.nextLine();
			Scanner linescan = new Scanner(line);
			linescan.useDelimiter("[\\p{javaWhitespace}:]+");

			cognome = linescan.next();
			nome = linescan.next();
			matricola = Integer.parseInt(linescan.next());

			matricole.add(new Student(nome, cognome, matricola));
		}
		filescan.close();

		System.out.println("Numero matricole inserite: " + matricole.size());
		System.out.println("Lista degli studenti:\n" + matricole);

		// 3. accetta una riga di input dall’utente, introdotta da tastiera: la riga di
		// input deve essere costituita

		Scanner in = new Scanner(System.in);

		System.out.println("Inserisci due stringhe");

		// il passo 5 è un ciclo
		while (in.hasNextLine()) {
			Scanner linescan = new Scanner(in.nextLine());
			try {
				String from = linescan.next();
				String to = linescan.next();
				Student fromStudent = new Student(from, "", 0);
				Student toStudent = new Student(to, "", 0);
				SortedSet canale = matricole.subSet(fromStudent, toStudent);

				// TODO (esempio) 4. stampa a standard output il sottoinsieme di matricole
				// formato dagli
				// studenti il cui cognome `e maggiore o uguale a stringa1 (eventualmente
				// inclusa) e strettamente minore di stringa2;
				// stampa inoltre la dimensione di tale sottoinsieme;

				System.out.println(
						"Numero di studenti del canale: " + canale.size() + " con cognome da " + from + " a " + to);
				System.out.println("Studenti: \n" + canale.toString());
				System.out.println("Inserisci due stringhe: ");

			} catch (NoSuchElementException e) {
				System.out.println("Devi inserire 2 stringhe!");
			}
		}

		// 5. ripete le operazioni 3 e 4 finch`e l’utente non introduce il comando di
		// terminazione dell’input
		// standard <CTRL>+D.

	}
}

class StudentSet implements SortedSet {

	// prima di qualsiasi altra cosa copio i diversi metodi di SortedSet qui su
	// StudentSet, modificandone i parametri di funzionamento;
	// per comodità, dopo aver copiato tutto faccio in modo che sia tutto
	// compilabiile, quindi dove si necessita del return ne metto uno
	// adeguato altrimenti lascio il metodo vuoto e verifico se la compilazione
	// dell'eseguibile va a buon fine

	// TODO costruttori

	public StudentSet() {
		v = new Student[INITSIZE];
		makeEmpty();
	}

	// TODO metodi pubblici
	@Override
	public boolean isEmpty() {
		return vSize == 0;
	}

	@Override
	public void makeEmpty() {
		vSize = 0;
	}

	// restituisce il numero di elementi nell'insieme
	@Override
	public int size() {
		return vSize;
	}

	/*
	 * Inserisce l'oggetto comparabile obj nell'insieme se non e` gia` presente,
	 * altrimenti fallisce silenziosamente.
	 */
	@Override
	public void add(Comparable obj) {
		if (!(obj instanceof Student)) {
			throw new IllegalArgumentException();
		}
		// contains
		if (contains(obj)) {
			return;
		}
		// resize
		if (vSize == v.length) {
			resize();
		}

		int i = vSize;
		while ((i > 0) && (v[i - 1].compareTo(obj) > 0)) {
			v[i] = v[i - 1];
			i--;
		}

		v[i] = (Student) obj;
		vSize++;
	}

	private void resize() {
		Student[] newV = new Student[2 + v.length];
		System.arraycopy(v, 0, newV, 0, v.length);
		v = newV;
	}

	/*
	 * Restituisce true se e solo se l'oggetto comparabile obj appartiene
	 * all'insieme. Verranno considerate ottime le soluzioni per cui questo metodo
	 * ha prestazioni O(log n)
	 */
	@Override
	public boolean contains(Comparable obj) {

		if (isEmpty()) {
			return false;
		}
		return binSearch(0, vSize - 1, obj) != -1;
	}

	private int binSearch(int from, int to, Comparable x) {
		if (from > to) {
			return -1;
		}
		int mid = (from + to) / 2;
		Comparable middle = v[mid];
		if (middle.compareTo(x) == 0) {
			return mid;
		} else if (middle.compareTo(x) < 0) {
			return binSearch(mid + 1, to, x);
		} else {
			return binSearch(from, mid - 1, x);
		}

	}

	/*
	 * Restituisce un array di oggetti comparabili contenente i riferimenti a tutti
	 * gli elementi presenti nell'insieme
	 */
	@Override
	public Comparable[] toArray() {
		Comparable[] x = new Student[vSize];
		System.arraycopy(v, 0, x, 0, vSize);
		return x;
	}

	/*
	 * Riceve due riferimenti ad oggetti comparabili e restituisce un riferimento ad
	 * un nuovo insieme, che contiene tutti e soli gli elementi dell'insieme di
	 * partenza (cioe` il parametro implicito del metodo) compresi tra fromObj
	 * (incluso) e toObj (escluso). Se fromObj non appartiene all'insieme di
	 * partenza, il primo elemento del nuovo insieme sara` il primo elemento
	 * maggiore di fromObj trovato nell'insieme di partenza. Se fromObj e toObj sono
	 * uguali, o se toObj e` piu` piccolo di fromObj, il nuovo insieme sara` vuoto
	 * 
	 * Complessità O(n)
	 */

	@Override
	public SortedSet subSet(Comparable fromObj, Comparable toObj) {
		if (!((fromObj instanceof Student) && (toObj instanceof Student))) {
			throw new IllegalArgumentException();
		}

		StudentSet x = new StudentSet();
		for (int i = 0; i < vSize; i++) {
			if ((v[i].compareTo(fromObj) >= 0) && (v[i].compareTo(toObj) < 0)) {

				if (x.vSize == x.v.length) {
					x.resize();
				}
				x.v[x.vSize++] = this.v[i];
			}
		}
		return x;
	}

	// TODO
	// Ogni studente su una riga diversa
	// il formato specificato dal metodo toString della classe Student
	@Override
	public String toString() {

		String s = "";
		for (int i = 0; i < vSize; i++) {
			s = s + v[i] + "\n";
		}
		return s;
	}

	// TODO campi di esemplare

	private Student[] v;
	private int vSize;
	private static final int INITSIZE = 1;
}

class Student implements Comparable // non modificare!!
{
	public Student(String c, String n, int m) {
		cognome = c;
		nome = n;
		matricola = m;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricola() {
		return matricola;
	}

	/*
	 * I dati dello studente vengono stampati nel formato
	 * "cognome        nome          : n.matricola" Per il campo cognome e per il
	 * campo nome vengono allocati maxlength=15 caratteri
	 */
	@Override
	public String toString() {
		int maxlength = 15;
		String sep1 = "";
		for (int i = 0; i < (maxlength - cognome.length()); i++) {
			sep1 += " ";
		}
		String sep2 = "";
		for (int i = 0; i < (maxlength - nome.length()); i++) {
			sep2 += " ";
		}
		return cognome + sep1 + nome + sep2 + ": " + matricola;
	}

	/*
	 * Lo studente x e` "maggiore" dello studente y se il cognome di x segue quello
	 * di y secondo l'ordinamento lessicografico. Se i due cognomi sono uguali,
	 * allora x e` "maggiore" di y se il nome di x segue quello di y secondo
	 * l'ordinamento lessicografico. Se anche i nomi sono uguali (due studenti
	 * omonimi) allora x e` "maggiore" di y se la sua matricola e` piu` grande di
	 * quella di y. Esempio1: (DeMorgan Augustus : 511123) e` maggiore di (Babbage
	 * Charles : 599987) Esempio2: (Bernoulli Nicolaus : 577789) e` maggiore di
	 * (Bernoulli Jacob : 500098) Esempio3: (Bernoulli Nicolaus : 588890) e`
	 * maggiore di (Bernoulli Nicolaus : 577789)
	 * 
	 */
	@Override
	public int compareTo(Object other) {
		Student aStudent = (Student) other;
		int comp = cognome.compareTo(((Student) other).cognome);
		if (comp == 0) {
			comp = nome.compareTo(((Student) other).nome);
		}
		if (comp == 0) {
			comp = matricola - ((Student) other).matricola;
		}
		return comp;
	}

	/*
	 * Due studenti x e y sono "uguali" solo se hanno lo stesso cognome e lo stesso
	 * nome e lo stesso numero di matricola. Esempio: (Babbage Charles : 599987) e`
	 * uguale a (Babbage Charles : 599987)
	 * 
	 */
	@Override
	public boolean equals(Object other) {
		return this.compareTo(other) == 0;
	}

	private String cognome;
	private String nome;
	private int matricola;
}

interface SortedSet // non modificare!!
{ // verifica se l'insieme contiene almeno un elemento
	boolean isEmpty();

	// svuota l'insieme
	void makeEmpty();

	// restituisce il numero di elementi nell'insieme
	int size();

	/*
	 * Inserisce l'oggetto comparabile obj nell'insieme se non e` gia` presente,
	 * altrimenti fallisce silenziosamente.
	 */
	void add(Comparable obj);

	/*
	 * Restituisce true se e solo se l'oggetto comparabile obj appartiene
	 * all'insieme. Verranno considerate ottime le soluzioni per cui questo metodo
	 * ha prestazioni O(log n)
	 */
	boolean contains(Comparable obj);

	/*
	 * Restituisce un array di oggetti comparabili contenente i riferimenti a tutti
	 * gli elementi presenti nell'insieme
	 */
	Comparable[] toArray();

	/*
	 * Riceve due riferimenti ad oggetti comparabili e restituisce un riferimento ad
	 * un nuovo insieme, che contiene tutti e soli gli elementi dell'insieme di
	 * partenza (cioe` il parametro implicito del metodo) compresi tra fromObj
	 * (incluso) e toObj (escluso). Se fromObj non appartiene all'insieme di
	 * partenza, il primo elemento del nuovo insieme sara` il primo elemento
	 * maggiore di fromObj trovato nell'insieme di partenza. Se fromObj e toObj sono
	 * uguali, o se toObj e` piu` piccolo di fromObj, il nuovo insieme sara` vuoto
	 */
	SortedSet subSet(Comparable fromObj, Comparable toObj);

}
