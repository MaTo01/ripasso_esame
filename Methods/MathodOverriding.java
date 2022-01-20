package Preparazione_esame.Methods;

public class MathodOverriding {
    
    // method overriding = dichiarare un metodo in una sottoclasse
    //                     già presente in una classe principale
    //                     fatto in modo che una classe figlia 
    //                     possa avere la propria implementazione

    public static void main(String [] args){

        Dog dog = new Dog();
        Animal animal = new Animal();


        animal.speak();
        dog.speak();

    }

}
