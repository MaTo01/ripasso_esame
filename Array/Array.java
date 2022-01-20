package Preparazione_esame.Array;

public class Array {
    
    //Array = viene utilizzato per salvare più valori in una singola variabile

    public static void main (String[] args){

        String[] cars = {"Camaro","Corvette","Tesla"}; //questo è un modo per inizializzarer un array

        cars[0] = "Mustang"; //assegna un nuovo vallore all'array nell'indice 0: Camaro --> Mustang

        System.out.println(cars[0]); //stampa in uscita il valore dell'array all'indice 0

        String[] newCars = new String[3]; //assegna un valore di x variabili al tuo array

        newCars[0] = "Alfa Romeo";
        newCars[1] = "Fiat";
        newCars[2] = "Opel";

        System.out.println(newCars[0]);

        for(int i = 0; i<newCars.length; i++){
            System.out.println(newCars[i]);     //stampa in uscita tutto l'array
        }
    }

}
