package Preparazione_esame.Loops;

import java.util.ArrayList;

public class ForEachLoop {
    
    // for-each loop = una tecnica di attraversamento attraverso gli
    //                 elementi di un array/collection

    // pro = meno passaggi, più affidabile
    // contro = meno flessibile
    
    public static void main(String[] args){
        
        String[] animals = {"cat", "dog", "rat", "bird"};

        for(String i : animals){
            System.out.println(i);
        }

        ArrayList<String> newAnimals = new ArrayList<String>();

        for(String i : newAnimals){
            System.out.println(i);
        }
    }

}
