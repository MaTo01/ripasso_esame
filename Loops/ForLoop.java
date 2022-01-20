package Preparazione_esame.Loops;

public class ForLoop {
    
    // for = esegue un blocco di codice per un tempo limitato

    public static void main (String[] args){

        //dichiariamo un indice i da cui far partire il conteggio (i);
        //lo facciamo esegui fino a quando la condizione è vera (i<=10),
        //ad ogni ciclo l'indice aumenta o diminuisce di un determinato valore(i++)

        for(int i=0; i<=10; i++ ){ 

            System.out.println(i);
            
        }

        for(int i=10; i<=0; i-- ){ 

            System.out.println(i);
            
        }

        for(int i=10; i<=0; i-=2 ){ 

            System.out.println(i);
            
        }

    }

}
