package Preparazione_esame.Objects;


public class OOP {
    
    //OOP = programmazione ad oggetti
    //Object = un'istanza di una classe che potrebbe contenere 
    //         attributi e metodi


    public static void main (String[]args){

        Car myCar = new Car();

        System.out.println(myCar.modello);
        System.out.println(myCar.marca);

        myCar.guida();
    }
}
