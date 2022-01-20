package Preparazione_esame.Basics;

public class Switches{
    public static void main (String[] args){
        //Switch = permette di verificare l'ugualianza tra una variabile e una lista di valori

        String day = "Venerdì";

        switch(day) {
            case "Lunedì": System.out.println("Oggi è Lunedì");
            break;
            case "Martedì": System.out.println("Oggi è Martedì");
            break;
            case "Mercoledì": System.out.println("Oggi è Mercoledì");
            break;
            case "Giovedì": System.out.println("Oggi è Giovedì");
            break;
            case "Venerdì": System.out.println("Oggi è Venerdì");
            break;
            case "Sabato": System.out.println("Oggi è Sabato");
            break;
            case "Domenica": System.out.println("Oggi è Domenica");
            break;
            default: System.out.println("Non hai inserito un giorno valido!");
        }
    }
}