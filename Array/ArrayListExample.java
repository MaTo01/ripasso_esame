package Preparazione_esame.Array;

import java.util.ArrayList;

public class ArrayListExample {

    // ArrayList = un array ridimensionabile
    //             gli elementi di questo array possono essere 
    //             aggiunti o rimossi anche dopo la fase di compilazione

    //             si utilizza solo con dati di riferimento (Integer, Double, Character..)

    public static void main (String[] args){
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi"); //all'indice 0 cambia la stringa attuale con "sushi"

        food.remove(2); //rimuovi la stringa all'indice 2

        food.clear(); //rimuove tutti gli elementi presenti nell'array
        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }

}
