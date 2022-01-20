package Preparazione_esame.Constructors;

public class Constructors {
    
    //constructors = è un metodo speciale che viene richiamato quando
    //               un oggetto è instanziato (creato)

    public static void main (String[] args){

        Human human1 = new Human("Marco",20,100);
        Human human2 = new Human("Matteo",16,90);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human2.mangia();
        human1.bevi();
    }
}
