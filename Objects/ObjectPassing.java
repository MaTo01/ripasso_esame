package Preparazione_esame.Objects;

public class ObjectPassing {
    
    public static void main (String[] args){

        Garage garage = new Garage();
        CarParking car1 = new CarParking("BMW");
        CarParking car2 = new CarParking("Tesla");


        garage.park(car1);
        garage.park(car2);

    }

}
