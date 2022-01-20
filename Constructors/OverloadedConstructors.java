package Preparazione_esame.Constructors;

public class OverloadedConstructors {
    // overloaded constructors = più costruttori all'interno di una classe
    //                           con lo stesso nome ma con parametri differenti
    //                           NomeCostruttore + parametri = firma

    public static void main (String[] args){

        Pizza pizza = new Pizza("cornicione alto","pomodoro","mozzarella");

        System.out.println("Ecco gli ingredienti della tua pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


    }
}
