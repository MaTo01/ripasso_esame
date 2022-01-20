package Preparazione_esame.String;

public class toStringMethod {
   
    // toString() = metodo speciale che tutti gli oggetti possono ereditare
    //              questo metodo restituisce una stringa che rappresenta 
    //              testualmente l'oggetto; può essere sia implicito che esplicito

    public static void main(String[] args){
       
        Car car = new Car();

        System.out.println(car.marca);
        System.out.println(car.modello);
        System.out.println(car.anno);
        System.out.println(car.color);
        System.out.println(car.prezzo);

        //usando il metodo toString():
        System.out.println("con toString(): ");
        System.out.println(car.toString());

    }
}
