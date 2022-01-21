package Preparazione_esame.Generics;

import java.util.ArrayList;

public class GenericClasses {
    
    public static void main (String[] args){
        
        /*
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('!');
        MyStringClass myString = new MyStringClass("Ciao");
        */

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass<>('!');
        MyGenericClass<String> myString = new MyGenericClass<>("Ciao");
    
        MyGenericClass2<Integer, Double> myIntDouble = new MyGenericClass2<>(2, 4.5);

        ArrayList<String> myFriends = new ArrayList<>(); //anche le arrayList utilizzano una generic class

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
        System.out.println(myIntDouble.getValue() + ", " + myIntDouble.getValue2());
    }

   
}

/*

Fare 4 classi diverse impiega troppo tempo, quindi ne faremo una 
sola, generica

class MyIntegerClass{

    Integer x;
    
    MyIntegerClass(Integer x){
        this.x = x;
    }

    public Integer getValue(){
        return x;
    }
}

class MyDoubleClass{
   
    Double x;
    
    MyDoubleClass(Double x){
        this.x = x;
    }

    public Double getValue(){
        return x;
    }
}

class MyCharacterClass{
    
    Character x;
    
    MyCharacterClass(Character x){
        this.x = x;
    }

    public Character getValue(){
        return x;
    }
}

class MyStringClass{
    
    String x;
    
    MyStringClass(String x){
        this.x = x;
    }

    public String getValue(){
        return x;
    }
}
*/

//creo una classe generica di "Thing" data type
class MyGenericClass <Thing>{
    
    Thing x;
    
    MyGenericClass(Thing x){
        this.x = x;
    }

    public Thing getValue(){
        return x;
    }
}

// posso anche creare una classe generica con più valori
class MyGenericClass2 <Thing, Thing2>{
    
    Thing x;
    Thing2 y;
    
    MyGenericClass2(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing getValue(){
        return x;
    }

    public Thing2 getValue2(){
        return y;
    }

}

