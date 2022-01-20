package Preparazione_esame.Encapsulation;

public class Encapsulation {
   
    // Encapsulation = gli attributi di una class vengono nascosti o resi private;
    //                 ci si può accedere solo tramite metodi (getters & setters).
    //                 bisognerebbe creare degli attributi private se non hai motivo di 
    //                 crearli public/protected

    public static void main(String[]args){
        Car car = new Car("Fiat", "punto", 2020);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getyear());

        car.setYear(2021);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getyear());

    }
}
