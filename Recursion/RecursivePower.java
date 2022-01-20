package Preparazione_esame.Recursion;

public class RecursivePower {
    
    public static void main(String[] args){

        int base = 2;
        int exponent = 8;

        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }

    private static int power(int base, int exponent) {

        //caso base
        if(exponent < 1){
            return 1;
        }

        //ricorsione
        return base * power(base, exponent -1);
    }
}
