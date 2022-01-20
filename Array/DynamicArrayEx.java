package Preparazione_esame.Array;

//import java.util.ArrayList;

public class DynamicArrayEx {
    
    // Dynamic array = funziona come un array, ma differneza di quello static
    //                 la sua capacità è variabile
    //***************************************************************************************
    //                       Static Array
    //
    //                   new String[capacity]
    //                   
    //             0     1     2     3     4     5
    //           ["A"] ["B"] ["C"] ["D"] ["E"] [null]
    //           size: 5
    //           capacity: 6
    //           
    // caratteristiche: 
    // 1. puoi accedere randomicamente ad un qualsiasi elemento in un tempo costante
    //    pari a O(1).
    // 2. la ricerca di un'elemento immagazzinato impiega del tempo indicato con
    //    un tempo lineare pari a O(n).
    // 3. aggiungere o eliminare elementi richiede tempo lineare
    // 4. per aggiungere un elemento all'indice 0 (esempio):
    //
    //             0     1     2     3     4     5
    //           [   ] ["A"] ["B"] ["C"] ["D"] ["E"] 
    //           size: 6
    //           capacity: 6
    //
    //             0     1     2     3     4     5
    //           ["X"] ["A"] ["B"] ["C"] ["D"] ["E"] 
    //           size: 6
    //           capacity: 6
    //
    // 5. per eliminare un elemento all'indice 0 (esempio):
    //
    //             0     1     2     3     4     5
    //           [   ] ["A"] ["B"] ["C"] ["D"] ["E"] 
    //           size: 5
    //           capacity: 6
    //
    //             0     1     2     3     4     5
    //           ["A"] ["B"] ["C"] ["D"] ["E"] [null]
    //           size: 5
    //           capacity: 6
    //
    // 6. non puoi modificare la capacità dell'array
    //
    //***************************************************************************************
    //
    //                       Dynamic Array
    // 
    //                   new String[capacity]
    // 
    //             0     1     2     3     4       
    //           ["A"] ["B"] ["C"] ["D"] ["E"] [qualcosa]
    //           size: 5
    //           capacity: 5
    //
    //                   new String[capacity * 2]
    //
    //             0     1     2     3     4      5        6        7        8        9
    //           ["A"] ["B"] ["C"] ["D"] ["E"] ["null"] ["null"] ["null"] ["null"] ["null"]
    //           size: 5
    //           capacity: 10
    //
    // caratteristiche: 
    // 1. puoi accedere randomicamente ad un qualsiasi elemento in un tempo costante
    //    pari a O(1). 
    // 2. buona locazione di riferimento e consumo efficente di memoria cache
    // 3. inserimento e rimzione semplici
    // 4. consuma più memoria di una linkedList
    // 5. lo shifting degli elementi avviene in un tempo pari a O(n)
    // 6. espandere o ridurre l'array impiega del tempo pari a O(n)
    //***************************************************************************************

    public static void main(String[]args){

        DynamicArrayClass dynamicArray = new DynamicArrayClass(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        

        //dynamicArray.insert(3,"D");
        //dynamicArray.delete("A");

        System.out.println(dynamicArray.toString());
        System.out.println("Dimensione: " + dynamicArray.size);
        System.out.println("Capacità: " + dynamicArray.capacity);
        System.out.println("Array vuoto: " + dynamicArray.isEmpity());
        //System.out.println("Posizione della lettera C: " + dynamicArray.search("C"));
        System.out.println();

        //incrementando la dimensione dell'array oltre la sua capacità
        //parte in automatico il metodo grow() che ne raddoppia la capacità
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");
        System.out.println(dynamicArray.toString());
        System.out.println("Dimensione: " + dynamicArray.size);
        System.out.println("Capacità: " + dynamicArray.capacity);
        System.out.println("Array vuoto: " + dynamicArray.isEmpity());
        System.out.println();

        //una volta che l'array raggiunge un terzo della sua capacità
        //parte in automatico il metodo shrink() che ne dimezza la capacità
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        dynamicArray.delete("E");
        System.out.println(dynamicArray.toString());
        System.out.println("Dimensione: " + dynamicArray.size);
        System.out.println("Capacità: " + dynamicArray.capacity);
        System.out.println("Array vuoto: " + dynamicArray.isEmpity());
        System.out.println(); 


    }
}
