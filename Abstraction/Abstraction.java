package Preparazione_esame.Abstraction;

public class Abstraction {
    
    // abstract = una classe astratta non può essere inizializzata, ma
    //            può avere una sottoclasse.
    //            I metodi astratti vengono dichiarati senza implementazione

    public static void main (String[]args){

        Car car = new Car();
        //Veichle veichle = new Veichle();

        car.go();
    }

}
