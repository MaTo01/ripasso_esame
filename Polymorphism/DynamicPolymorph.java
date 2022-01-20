package Preparazione_esame.Polymorphism;

import java.util.Scanner;

public class DynamicPolymorph {
    
    // polymorphism = più forme/tipi
    // dynamic = dopo la compilazione (durante il runtime);

    // ex. una Corvette è: una Corvette, un'auto, unveicolo e un oggetto

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        Animal animal;

        System.out.println("Scegli un animale");
        System.out.print("(1=cane) or (2=gatto): ");
        int choice = in.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("Devi scegliere tra 1 e 2!");
            animal.speak();
        }

        in.close();
    }
}
