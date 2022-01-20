package Preparazione_esame.Polymorphism;

public class Polymorphism {
    // polymorphism = L'abilità di un oggetto di identificarsi
    //                in più di un singolo data type

    public static void main(String[]args){

        PolyCar car = new PolyCar();
        PolyBycicle bycicle = new PolyBycicle();
        PolyBoat boat = new PolyBoat();

        PolyVehicle[] racers = {car, bycicle, boat};

        for(PolyVehicle x : racers){
            x.go();
        }
    }
}
