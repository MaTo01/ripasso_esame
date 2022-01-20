package Preparazione_esame.Basics;

public class Expressions {
    public static void main (String[] args){
        // espressioni = operatori e operandi
        // operandi = valori, variabili, numeri, quantità
        // operatori = + - * / %

        int friends = 10; //ho 10 amici

        System.out.println("Amici: "+friends);
        friends = friends + 2; //aggiungi un amico
        System.out.println("Ho due nuovi amici, ora in totale sono: "+friends);
        friends++; //modo alternativo per aggiungere SOLO UN amico
        System.out.println("Ho un nuovo amici, ora in totale sono: "+friends);
        friends = friends - 2; //rimuovi un amico
        System.out.println("Ho due amici in meno, ora in totale sono: "+friends);
        friends--; //modo alternativo per rimuovere SOLO UN amico
        System.out.println("Ho un amico in meno, ora in totale sono: "+friends);
        friends = friends/2; //dividi gli amici per un determinato valore
        System.out.println("la metà dei miei amici è: "+friends);
        friends = friends*2; //moltiplica gli amici per un determinato valore
        System.out.println("Se moltiplico la metà dei miei amici per il doppio, in totale sono: "+friends);
        friends = friends%3; //dividi gli amici per un determinato valore e visualizza solo il resto della divisione
        System.out.println("se divido in gruppi di 3, ne rimangono fuori: "+friends);
    }
}
