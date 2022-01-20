package Preparazione_esame.Basics;

public class Printf {
    
    // printf() = un metodo opzionale per controllare, formattare
    //            e visualizzare testi alla finestra della console
    
    // due argomenti = format string + (oggetto/variabile/valore)
    // % [flags] [precision] [width] [conversion-character]

    public static void main (String[] args){
        System.out.printf("Questo è un formato di stringa %d", 123);
        System.out.printf("%d Questo è un formato di stringa", 123);

        boolean myBoolean = true;
        char myChar ='@';
        String myString = "Marco";
        int myInt = 50;
        double myDouble = 100;

        //conversion-character
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        //[width] = spazi da scrivere in output prima dell'oggetto
        System.out.printf("Ciao %10s", myString);

        //[precision] = setta un numero di decimali da visualizzare quando
        //              in output abbiamo un valore a virgola mobile
        System.out.printf("Questi sono tutti i soldi che hai: %.2f", myString);
        
        //[flags] = aggiunge un effetto all'output basato sulla flag aggiunta
        //          al format specifier 
        

    }
}

