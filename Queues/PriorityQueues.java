package Preparazione_esame.Queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    
    //priority Queue = una struttura dati FIFO che serve prima gli elementi
    //                 con priorità alta e poi quelli con priorità inferiori

    public static void main(String[]args){

        Queue<Double> queue1 = new LinkedList<>();

        queue1.offer(3.0);
        queue1.offer(2.5);
        queue1.offer(4.0);
        queue1.offer(5.0);
        queue1.offer(1.5);

        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }

        System.out.println();

        Queue<Double> queue2 = new PriorityQueue<>();
         
        queue2.offer(3.0);
        queue2.offer(2.5);
        queue2.offer(4.0);
        queue2.offer(5.0);
        queue2.offer(1.5);

        while(!queue2.isEmpty()){ //con priority queue stampa in ordine di grandezza crescente
            System.out.println(queue2.poll());
        }

        System.out.println();

        Queue<Double> queue3 = new PriorityQueue<>(Collections.reverseOrder());
         
        queue3.offer(3.0);
        queue3.offer(2.5);
        queue3.offer(4.0);
        queue3.offer(5.0);
        queue3.offer(1.5);

        while(!queue3.isEmpty()){ //aggiungendo reverseOrder stampa in ordine inverso
            System.out.println(queue3.poll());
        }

    }
    
}
