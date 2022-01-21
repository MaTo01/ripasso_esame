package Preparazione_esame.HashTables;

import java.util.*;

public class HashTableEx {
    
    // HashTable = una struttura dati che assegna keys uniche a dei valori
    //             ad esempio <Integer, String> (Integer è la key, String è il valore)
    //             ogni coppia di key-valore viene definita come Entry
    //             
    //  vantaggi : 1. inserimento veloce
    //             2. ricerca veloce
    //             3. rimozione di coppie key-valore veloce
    //             4. ottimo per grandi quantità di datiù
    //
    // svantaggi : 1. non è ideale per piccole quantità di dati 

    // hashing = prende una key e calcola un Integer (la formula varia in base alla key e il data type)
    //           nelle HashTables usiamo hash % capacità per calcolare un numero che rappresenta l'indice
    //
    //           esempio: key.hashCode() % capacity = index

    // bucket = è lo storage dell'indice per una o più Entry
    //          questo può contenere più Entry in caso di collisione (il bucket diventa una linkedList)

    // collision = quando la funzione di hash genera lo stesso indice per più di una key
    //             in generale: meno collisioni = più efficenza

    // velocità di esecuzione : nella migliore delle ipotesi O(1) (tempo costante)
    //                          nella peggiore delle ipotesi O(n) (tempo lineare)

    public static void main(String[] args){

        Hashtable<Integer, String> tableInteger = new Hashtable<>(10);

        tableInteger.put(106, "Matteo");
        tableInteger.put(250, "Marco");
        tableInteger.put(361, "Massimiliano");
        tableInteger.put(585, "Alessia");
        tableInteger.put(789, "Giada");
        tableInteger.put(108, "Anna");

        for(Integer key : tableInteger.keySet()){

            System.out.println(key.hashCode() % 10 + "\t" +  key + "\t" + tableInteger.get(key));
        }

        //tableInteger.remove(108);
        
        System.out.println();

        Hashtable<String, String> tableString = new Hashtable<>(21); // se lasciassi 10 come prima, ci sarebbero dei bucket in collisione

        tableString.put("106", "Matteo");
        tableString.put("250", "Marco");
        tableString.put("361", "Massimiliano");
        tableString.put("585", "Alessia");
        tableString.put("789", "Giada");
        tableString.put("108", "Anna");

        //nel caso in cui la key fosse una stringa, con hashCode la convere in ASCII
        for(String key : tableString.keySet()){

            System.out.println(key.hashCode() % 21 + "\t" +  key + "\t" + tableString.get(key));
        }

        //tableString.remove("108");

    }
}
