package Preparazione_esame.Constructors;

public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void mangia(){
        System.out.println(this.name + ", devi mangiare!");
    }
    void bevi(){
        System.out.println(this.name + ", devi bere!");
    }
}
