package Preparazione_esame.AcessModifier2;
import Preparazione_esame.AcessModifier1.*;


public class C {
    
    public String publicMessage = "Questo è un messaggio pubblico";
    // public = visibile e richiamabile da tutti
    protected String protectedMessage = "|PROTETTO|";
    // protected = visibile e richiamabile solo in sottoclassi
    private String privateMessage = "Questo è un messaggio privato!";
    // private = non puoi mai richiamarlo, fa parte solo della classe
    //           a cui appartiene
    String defaultMessage = "Questo è un messaggio di default";

}
