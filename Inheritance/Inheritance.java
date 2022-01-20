package Preparazione_esame.Inheritance;

public class Inheritance {
    
    // inheritance = il processo in cui una classe acquisice
    //               gli attributi e i metodi di un'altra classe

    public static void main (String[]args){
        
        Car car = new Car();

        car.go();

        Bicycle bike = new Bicycle();

        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);

    }

}
