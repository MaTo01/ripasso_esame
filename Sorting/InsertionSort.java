package Preparazione_esame.Sorting;

public class InsertionSort {
    
    // Insertion Sort = partendo dall'indice 1, porto quell'elemento in una variabile
    //                  temporanea ed esamino gli elementi alla sinistra del'elemento 
    //                  che ho rimosso temporaneamente.
    //                  Se l'elemento alla sinistra del mio valore è più grande di esso,
    //                  lo sposto a destra, fino a quando non trovo un valore più piccolo
    //                  di quello presente nella variabile temporanea
    //
    //                  impiega un tempo quadratico O(n^2)
    //                  per piccole quantità di dati = discreto
    //                  per grandi quantità di dati = NON OK
    
    public static void main (String[]args){

        int array[] = {2, 4, 6, 1, 3, 7, 5, 9, 8};

        insertionSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = temp;

        }
        
    }

}
