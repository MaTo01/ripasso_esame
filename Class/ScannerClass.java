package Preparazione_esame.Class;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Come ti chiami? ");
        String name = in.nextLine();
        System.out.println("");

        System.out.print("Quanti anni hai? ");
        int age = in.nextInt();
        in.nextLine(); //se non mettesi questo, non mi leggerebbe il prossimo nextLine
        System.out.println("");

        System.out.print("Qual è il tuo cibo preferito? ");
        String food = in.nextLine();
        System.out.println("");

        System.out.println("Ciao "+name+", hai "+age+" anni e questo è il tuo cibo preferito: "+food);

        in.close();
    }

}
