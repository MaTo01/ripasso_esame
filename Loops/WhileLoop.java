package Preparazione_esame.Loops;

import java.util.Scanner;

public class WhileLoop {
    
    //while = esegue un blocco di codice fino a quando la condizione è vera

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){

            System.out.print("come ti chiami? ");
            name = in.nextLine();

        }
    
        System.out.println("ciao "+name);

        String surname = "";

        do{
            System.out.print("qual è il tuo cognome? ");
            surname = in.nextLine(); 
        }while(surname.isBlank());
        
        //utilizzando questo tipo di while, il blocco dentro alle parentesi viene 
        //eseguito almeno una volta, e solo dopo controlla la condizione

        System.out.println("ciao "+name+" "+surname);

        in.close();
    }

}
