package Preparazione_esame.Basics;

import java.util.Scanner;

public class MathClassExample {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double a; //cateto
        double b; //catetp
        double c; //ipotenusa

        System.out.print("Quanto misura il lato a? ");
        a = in.nextDouble();
        System.out.print("Quanto misura il lato b? ");
        b = in.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("L'ipotenusa ha valore: "+c);

        in.close();
    }
}
