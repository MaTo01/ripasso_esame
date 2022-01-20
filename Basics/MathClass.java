package Preparazione_esame.Basics;

public class MathClass {
    public static void main(String[] args){

        double x = 3.14;
        double y = 10;

        double M = Math.max(x,y); //massimo tra due numeri
        double m = Math.min(x,y); //minimo tra due numeri
        double abs = Math.abs(y); // valore assoluto di un numero
        double radice = Math.sqrt(x); //radice quadrata di un numero
        double rounded = Math.round(x); //numero arrotondato
        double roundedUp = Math.ceil(x); //numero arrotondato in eccesso
        double roundedDown = Math.floor(x); //numero arrotondato in difetto
        
        System.out.println("massimo: "+M);
        System.out.println("minimo: "+m);
        System.out.println("valore assoluto: "+abs);
        System.out.println("radice: "+radice);
        System.out.println("valore arrotondato: "+rounded);
        System.out.println("valore arrotondato in eccesso: "+roundedUp);
        System.out.println("valore arrotondato in difetto: "+roundedDown);
    }
}
