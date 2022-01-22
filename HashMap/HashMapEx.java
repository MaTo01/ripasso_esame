package Preparazione_esame.HashMap;

import java.util.*;

public class HashMapEx {
    
    // HashMap = implementa l'interfaccia MAP 
    //           E' simile all'arrayList, ma con coppie key-valore
    //           immagazzina oggetti, quindi ha bisogno di utilizzare le wrapper class
    //           esempi: (nome, email), (username, userID), (Stato, Capitale)

    public static void main(String[] args){
        HashMap<String, String> countries = new HashMap<String, String>();

        //aggiungi una key e un valore
        countries.put("Italia", "Roma");
        countries.put("Francia", "Parigi");
        countries.put("Spagna", "Madrid");
        countries.put("Olanda", "Amsterdam");

        //System.out.println(countries.get("Italia")); 

        //countries.remove("Francia");

        //countries.clear();

        //System.out.println(countries.size()); 

        //countries.replace("Spagna", "Valencia");

        //System.out.println(countries.containsKey("Italia")); 
        //System.out.println(countries.containsValue("Venezia"));

        for(String i : countries.keySet()){
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }
        //System.out.println(countries);
    }
}
