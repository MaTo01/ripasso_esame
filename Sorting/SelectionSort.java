package Preparazione_esame.Sorting;

public class SelectionSort {
    
    // Selection sort = ricerca dentro un array e tiene traccia del valore
    //                  minimo durante ogni iterazione.
    //                  Alla fine di ogni iterazione, le variabili si scambiano 

    //                  impiega un tempo quadratic O(n^2)
    //                  per piccole quantità di dati = OK
    //                  per grandi quantità di dati = NON OK

    public static void main(String[]args){

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for(int i : array){
                System.out.print(i + " ");
        }

    }

    
    private static void selectionSort(int[] array) {

        // ordine crescente
        for(int i = 0; i < (array.length - 1); i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        //ordine decrescente
        /*
        for(int i = 0; i < (array.length - 1); i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] < array[j]){
                    min = j;
                }
            
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        */
    }
    

}

