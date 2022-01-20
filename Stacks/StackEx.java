package Preparazione_esame.Stacks;

import java.util.Stack;

public class StackEx {
    
    // stack (pila) = Struttura dati di tipo LIFO (Last-im, First-out)
    //                immagazzina oggetti in una spece di "torre verticale"
    //                usa il metodo push() per aggiungere elementi in cima
    //                usa il metodo pop() per eliminare elementi partendo dalla cima
 
    public static void main(String[]args){
        
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.isEmpty()); //verifica se la pila è vuota

        stack.push("Minecraft"); //aggiungi elemento alla pila
        stack.push("FH5"); //aggiungi elemento alla pila sopra all'ultimo inserito
        stack.push("DOOM"); //...
        stack.push("Pokemon"); //...
        stack.push("GTA5");

        System.out.println(stack.isEmpty()); // verifica di nuovo se la pila ora è vuota
        System.out.println(stack); //stampa la pila

        //String myFavGame = stack.pop(); //assegna ad una variabile l'ultimo gioco aggiunto
        //                                  alla pila ed eliminalo subito dopo
        //System.out.println(myFavGame);

        //System.out.println(stack.peek()); //visualizza l'elemento presente in cima

        //System.out.println(stack.search("GTA5")); //cerca in che posizione si trova un certo elemento

        stack.pop(); //elimina l'elemento in cima alla pila
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        for(int i = 0; i< 100000000; i++){ //rischi l'out of memory
            stack.push("Fallout76");
        } 

        // utilità delle pile:
        // 1. funzione undo/redo negli editor di testo
        // 2. muoversi avanti/indietro nella cronologia browser
        // 3. algoritmi di tracciamento inverso (labirinto, directories) 
        // 4. richiamo di funzioni  

    }

}
