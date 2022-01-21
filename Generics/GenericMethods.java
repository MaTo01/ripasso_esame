package Preparazione_esame.Generics;

public class GenericMethods {
    
    // generics = permette a classi e interfacce di essere dei parametri quando definite:
    //            Classi, interfacce e metodi
    //            un beneficio di ciò è che elimina il bisogno di creare diverse verioni di
    //            metodi o classi per diversi tipi di data type
    //            usa una versione per tutte le reference data type

    public static void main(String[]args){

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String[] stringArray = {"F", "G", "H", "I", "J"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(stringArray));


    }

    /* wrapper classes per visualizzare tutti gli array

    E' sconveniente, perchè vanno creati 4 metodi

    public static void displayArray(Integer[] array){

        for(Integer x : array){
            System.out.print(x+" ");
        }
        System.out.println();

    }

    public static void displayArray(Double[] array){

        for(Double x : array){
            System.out.print(x+" ");
        }
        System.out.println();

    }

    public static void displayArray(Character[] array){

        for(Character x : array){
            System.out.print(x+" ");
        }
        System.out.println();

    }

    public static void displayArray(String[] array){

        for(String x : array){
            System.out.print(x+" ");
        }
        System.out.println();

    }
    */

    // in questa maniera creo un metodo generic
    // che sostituisce a "Thing" la reference data type necessaria
    public static <Thing> void displayArray(Thing[] array){

        for(Thing x : array){
            System.out.print(x+" ");
        }
        System.out.println();

    }

    // se con un metodo devo restituire qualcosa, ildata type di ritorno
    // sarà, in questo caso, "Thing"
    public static <Thing> Thing getFirst(Thing[] array){

        return array[0];

    }


}
