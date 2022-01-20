package Preparazione_esame.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    
    // Queue(coda) = struttura dati di tipo FIFO (First-in, First-out)
    //               è una raccolta studiata per trattenerre elementi prima 
    //               della lavorazione
    //               E' una struttura dati di tipo lineare (coda al supermercato)
    //
    //               Usa il metodo dequeue() per rimuovere l'elemento in testa alla coda
    //               Usa il metodo enqueue() per aggiungere un elemento in coda

    public static void main(String[] args){

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Alessia");
        queue.offer("Matteo");
        queue.offer("Sbarra");
        queue.offer("Simona");

        System.out.println(queue.isEmpty()); // verifica se la coda è vuota
        System.out.println(queue.size()); // verifica la grandezza della coda
        System.out.println(queue.contains("Simona")); // controlla se un certo elemento è presente 


        System.out.println(queue); // visualizza gli elementi della coda
        
        System.out.println(queue.peek()); //visualizza chi è il primo in lista
        queue.poll();//elimina il primo della lista
        queue.poll();
        queue.poll();
        queue.poll();

        // utilità delle code:
        // 1. buffer delle tastiere ( le lettere devono apparire nell'ordine in cui vengono schiacciate)
        // 2. code di stampa (le stampe devono essere completate in ordine)
        // 3. vengono usate nelle LinkedLists, PriorityQueues, ricerche in ampiezza



    }
}
