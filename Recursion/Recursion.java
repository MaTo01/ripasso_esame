package Preparazione_esame.Recursion;

public class Recursion {
    
    // recursion = quando una cosa viene definita in sè stessa
    //             Applica il risultato di una procedura, ad una prcedura
    //             un metodo recursivo si richiama. Può essere, infatti, una 
    //             alternativa alla iterazione.
    //             Dividi un problema in sotto-problemi dello stesso tipo degli
    //             originali.
    //             Viene tendenzialmente usato con algoritmi di advanced sorting
    //             e navigation trees
    //
    // Vantaggi:
    // 1. più facile da scrivere e leggere
    // 2. più semplice da debuggare
    //
    // Svantaggi:
    // 1. alle volte è più lento
    // 2. utilizza più memoria
    //
    //*********************************************************************************
    //                  __________________________________________
    //                 |    iterazione     |       ricorsione     |
    // ------------------------------------------------------------
    // Implementazione |   usa dei loop    |  richiama se stesso  |
    // ------------------------------------------------------------
    //      Stato      |  controllo indice | valore dei parametri |
    //                 |  (int steps = 0)  |    walk(int steps)   | 
    // ------------------------------------------------------------
    //   Progressione  |  si sposta verso  |  converge verso il   |
    //                 |     il valore     |        valore        |
    // ------------------------------------------------------------
    //     Termine     | l'indice soddisfa | caso base = true     |
    //                 |   le condizioni   |                      |
    // ------------------------------------------------------------
    //    Dimensione   |     più codice    |      meno codice     |
    //                 |    meno memoria   |      più memoria     |
    // ------------------------------------------------------------
    //     Velocità    |     più veloce    |      mano veloce     |
    // ------------------------------------------------------------

    public static void main(String[]args){
       
        iterativeWalk(5); //metodo iterativo 
        recursiveWalk(5); //metodo ricorsivo
    }

    // metodo di tipo iterativo
    private static void iterativeWalk(int steps) {
        for(int i = 0; i < steps; i++){
            System.out.println("Hai fatto un passo!");
        }
    }

    // metodo ricorsivo 
    private static void recursiveWalk(int steps) {
        
        // caso base
        if(steps < 1){
            return;
        }
        System.out.println("Hai fatto un passo!");

        //caso ricorsivo
        recursiveWalk(steps-1);
    }
}
