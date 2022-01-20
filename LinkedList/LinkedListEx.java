package Preparazione_esame.LinkedList;

import java.util.LinkedList;

public class LinkedListEx {
    

    public static void main(String[]args){
        
        LinkedList<String> linkedList = new LinkedList<String>();

        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        
        linkedList.pop();
        */

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
         //linkedList.poll();

        linkedList.add(4, "E"); //Aggiungi all'indice 4 la lettera E

        System.out.println(linkedList);

        System.out.println(linkedList.indexOf("F")); //visualizza in che indice si trova F

        System.out.println(linkedList.peekFirst()); // visualizza l'elemento in testa 
        System.out.println(linkedList.peekLast()); // visualizza l'elemento in coda

        linkedList.addFirst("0"); // aggiungi un valore in testa
        linkedList.addLast("G"); // aggiungi un valore in coda

        linkedList.remove("E");

        System.out.println(linkedList);

        

    }
}
