package Preparazione_esame.LinkedList;

import java.util.LinkedList;

public class LinkedListEx {
    
    //Linked List = struttura dati che immagazzina nodi in 2 parti (Data + address)
    //              i nodi si trovano in una memoria non consecutiva
    //              gli elementi vengono collegati tramite pointers
    //*******************************************************************************
    //                           Singly Linked List
    //                NODE                NODE                NODE
    //           [data | address] -> [data | address] -> [data | address] 
    //*******************************************************************************
    //                           Doubly Linked List
    //                     NODE                         NODE
    //           [address| data | address] -> [address| data | address] 
    //*******************************************************************************
    // vantaggi:
    // 1. Struttura dati dinamica (alloca le memorie necessarie while running)
    // 2. Inserimento e rimozione di nodi in maniera semplice (O(1))
    // 3. nessuno/basso spreco di memoria

    // svantaggi:
    // 1. consumo di memoria elevato 
    // 2. non è possibile usare il random access degli elementi (no index [i])
    // 3. cercare o accedere agli elementi impiega più tempo (O(n))

    // utilizzi:
    // 1. implementazione di pile o code
    // 2. navigazione GPS
    // 3. playlist musicali

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
