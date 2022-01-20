package Preparazione_esame.Sorting;

public class MergeSort {
    
    // merge sort = divide un array a metà in maniera ricorsiva, li riordina e
    //              li ricombina

    //              velocità di esecuzione = O(n log n)
    //              spazio richiesto = O(n)
    public static void main(String[]args){
        int[] array = {2, 4, 8, 7, 1, 6, 3, 9, 5};

        mergeSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        
        // caso base
        int length = array.length;
        if(length <= 1){
            return;
        }

        int mid = length/2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[length-mid];

        int i = 0; //left arrya
        int j = 0; //right array

        for(; i < length; i++){
            if(i < mid){
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0; // indici

        //controlla la condizione per il merging
        while( l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
