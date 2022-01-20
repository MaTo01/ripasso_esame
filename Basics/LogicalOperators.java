package Preparazione_esame.Basics;

import java.util.Scanner;

public class LogicalOperators {

    // operatori logici = vengono usati per connettere due o più espressioni
    // && (AND) = entrambe le condizioni devono essere vere
    // || (OR) = una delle due condizioni dev'essere vera
    // ! (NOT) = inverte il valore booleano della condizione

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        int temp = 25;

        if(temp>30){
            System.out.println("It's hot outside");
        }
        else if (temp>=20 && temp<=30){ //se la temperatura è compresa tra 20 E 30 gradi (AND)
            System.out.println("It's warm outside");
        }
        else{
            System.out.println("It's cold outside");
        }

        System.out.println("Stai giocando un gioco, per uscire premi q oppure Q");
        String risposta = in.nextLine();

        if(risposta.equals("q") || risposta.equals("Q")){ //si usa variabile.equals("valore") per verificare l'ugualianza di una stringa con un determinato valore
            System.out.println("Sei uscito dal gioco");
        }
        else {
            System.out.println("Stai ancora giocando");
        }

        if(!risposta.equals("q") && !risposta.equals("Q")){ //aggiungendo ! dico che se il valore NON corrisponde a q e nemmeno a Q, allora l'utente vuole giocare
            System.out.println("Stai ancora giocando");    
        }
        else {
            System.out.println("Sei uscito dal gioco");
        }


        in.close();
    }
}
