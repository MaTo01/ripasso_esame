package Preparazione_esame.Array;

import java.util.*;

public class ArrayList2D {
    
    //ArrayList 2D = una lista di una lista dinamica
    //puoi cambiare la dimensione di queste liste durante l'esecuzione

    public static void main (String[]args){


        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        
        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("zucchini");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("coca cola");
        drinksList.add("pepsi");
        
        groceryList.add(bakeryList);
        groceryList.add(drinksList);
        groceryList.add(produceList);

        System.out.println(groceryList); // visualizza tutta la lista 2D
        System.out.println(groceryList.get(0)); // visualizza solo la lista all'indice 0
        System.out.println(groceryList.get(0).get(2)); // visualizza la parola all'indice 2 della lista all'indice 0

    }
}
