package Preparazione_esame.Objects;

public class CopyObjects {
    public static void main(String[]args){

        CarCopyObjects car1 = new CarCopyObjects("Fiat", "Punto", 2011);
        //CarCopyObjects car2 = new CarCopyObjects("Opel", "Corsa", 2009);
        //car2.copy(car1);
        CarCopyObjects car2 = new CarCopyObjects(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());



    }
}
