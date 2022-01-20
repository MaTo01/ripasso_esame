package Preparazione_esame.Basics;

public class VariableSwap {
    public static void main(String[] args){
        String x = "Water";
        String y = "Cola";
        String temp;
        
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("Ora inverto le variabili");

        temp = x;
        x = y;
        y = temp;

        System.out.println("x = "+x);
        System.out.println("y = "+y);

    }
}
