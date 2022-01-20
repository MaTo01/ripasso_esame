package Preparazione_esame.Keyword;

public class Hero extends Person {
    
    String power;
    
    Hero(String name, int age, String power){
        super(name,age);  // facendo così sostituisco le due righe sotto
        //this.name = name;
        //this.age = age;
        this.power = power;
    }

    public String toString(){
        return super.toString() + this.power;
    }

}
