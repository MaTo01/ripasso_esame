package Preparazione_esame.Recursion;

public class Factorial_w_Recursion {
    
    public static void main(String[]args){
        
        int num = 7;

        System.out.println("Il fattoriale di " + num + " è: " + factorial(num));
    }

    private static int factorial(int num) {
        
        //caso base
        if(num < 1){
            return 1;
        }
        
        //ricorsione
        return num * factorial(num-1);
    }
}
