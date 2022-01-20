package Preparazione_esame.String;

public class StringMethods {
    
    public static void main(String[]args){

        String name = "Marco";

        //boolean risultato = name.equals("Marco"); 
            //confronta la stringa con un valore assegnato
            //e restituisce un valore booleano 
            //(TRUE se le parole sono uguali, FALSE se sono diverse)

        //boolean risultato = name.equalsIgnoreCase("Marco");
            //confronta la stringa con un valore assegnato 
            //(ignorando maiuscole e minuscole)
            //e restituisce un valore booleano 
            //(TRUE se le parole sono uguali, FALSE se sono diverse)

        //int risultato = name.length();
            //in questo modo si può verificare la lunghezza della stringa

        //char risultato = name.charAt(0);
            //con questo metodo si visualizza solo il carattere 
            //presente nell'indice che vogliamo (name.charAt(index))

        //int risulato = name.indexOf("M");
            //in questo modo sappiamo a che indice si trova un
            //determinato carattere della stringa

        //boolean risultato = name.isEmpty();
            //controlla se la stringa è vuota

        //String risultato = name.toUpperCase();
            //tutti i caratteri della stringa diventano maiuscoli
        
        //String risultato = name.toLowerCase();
            //tutti i caratteri della stringa diventano minuscoli

        //String risultato = name.trim();
            //se sono presenti degli spazi prima e dopo la string
            //questo metodo li elimina
        
        String risultato =  name.replace('o', 'a');
            //sostituisci tutti i caratteri 'o' presenti nella
            //stringa con caratteri 'a'  

        System.out.println(risultato);
    }

}
