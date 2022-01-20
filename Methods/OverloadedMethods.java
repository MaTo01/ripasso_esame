package Preparazione_esame.Methods;

public class OverloadedMethods {
    
    //overloaded methods = metodi che condividono lo stesso nome ma 
    //                     hanno parametri differenti 

    // NomeMetodo + Parametri = firma del metodo

    public static void main (String[]args){

        int x = somma(1, 2, 3, 4);
        System.out.println(x);
        double y = somma(2.4, 2.6);
        System.out.println(y);

    }

    static int somma(int a, int b){
        
        System.out.println("Questo è l'overloaded method n°1");
        return a+b;

    }

    static int somma(int a, int b, int c){
        
        System.out.println("Questo è l'overloaded method n°2");
        return a+b+c;

    }

    static int somma(int a, int b, int c, int d){
        
        System.out.println("Questo è l'overloaded method n°3");
        return a+b+c+d;

    }

    static double somma(double a, double b){
        
        System.out.println("Questo è l'overloaded method n°4");
        return a+b;

    }

    static double somma(double a, double b, double c){
        
        System.out.println("Questo è l'overloaded method n°5");
        return a+b+c;

    }

    static double somma(double a, double b, double c, double d){
        
        System.out.println("Questo è l'overloaded method n°6");
        return a+b+c+d;

    }


}
