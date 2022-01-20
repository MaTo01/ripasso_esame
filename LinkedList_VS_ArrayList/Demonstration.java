package Preparazione_esame.LinkedList_VS_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demonstration {
    
    public static void main(String[]args){
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        Long elapsedTime;

        for(int i = 0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        // ***********************LinkedList***********************

        startTime = System.nanoTime(); //inizia a contare il tempo di esecuzione

        // esegue i comandi
        //linkedList.get(0); 
        //linkedList.get(500000);
        //linkedList.get(999999);
        //linkedList.remove(0);
        //linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime(); //ferma la conta del tempo di esecuzione
        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns"); //visualizza il tempo di esecuzione

        // ***********************ArrayList***********************

        startTime = System.nanoTime(); //inizia a contare il tempo di esecuzione

        //esegue il comando
        //arrayList.get(0); 
        //arrayList.get(500000);
        //arrayList.get(999999);
        //arrayList.remove(0);
        //arrayList.remove(500000);
        arrayList.remove(999999);

        
        endTime = System.nanoTime(); //ferma la conta del tempo di esecuzione
        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns"); //visualizza il tempo di esecuzione
    }

}
