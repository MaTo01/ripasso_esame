package Preparazione_esame.Loops;

import java.util.*;

public class NestedLoop {
    
    //nested loop= non è altro che un loop dentro un altro loop

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.print("inserisci un numero di righe: ");
        rows = in.nextInt();
        System.out.print("inserisci un numero di colonne: ");
        columns = in.nextInt();
        System.out.print("inserisci un simbolo da utilizzare: ");
        symbol = in.next(); //salverà il token successivo fino a quando non vede uno spazio o un invio

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }

        in.close();
    }

}
