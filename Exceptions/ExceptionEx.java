package Preparazione_esame.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
   
    // exception = un evento che avviene durante l'esecuzione di un 
    //             prog. che interrompe il normale flusso di istruzioni

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        try{

            System.out.print("inserisci un numero intero da dividere: ");
            int x = in.nextInt();

            System.out.print("inserisci un numero intero con cui dividere il primo: ");
            int y = in.nextInt();

            int z = x/y;

            System.out.print("risultato: "+z);

        }
        catch(ArithmeticException e){ //se si presenta questa exception
            System.out.println("Non puoi dividere per zero!!"); //svolgi questo comando
        }
        catch(InputMismatchException e){
            System.out.println("Devi inserire un numero!!");
        }
        catch(Exception e){ //se si presenta una qualsiasi exception
            System.out.println("Qualcosa è andato storto");
        }
        
        // viene sempre eseguito questo comando alla fine del programma
        // che ci sia o meno meno un exception 
        finally{ 
            System.out.println("Questo verrà sempre stampato");
            in.close();
        }

    }
    
}
