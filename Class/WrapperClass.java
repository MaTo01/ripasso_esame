package Preparazione_esame.Class;

public class WrapperClass {
    
    //wrapper class = fornisce un modo per utilizzare il tipo di dati primitivo come tipo di dati di riferimento
    //questo si fa perchè il tipo di dati di riferimento contiene metodi molto utili
    //può essere usato con le collections (ex.ArrayList)

    //Primitive  |  Wrapper
    //---------------------
    // boolean   | Boolean
    // char      | Character
    // int       | Integer
    // double    | Double

    //autoboxing = la conversione automatica che il compilatore java fa tra 
    //             i tipi di dati primitivi ed i loro corrispondenti oggetti
    //             nella wrapper class

    //unboxing = la conversione automatica di una wrapper class a primitiva 

    public static void main (String[] args){

        //utilizzo l'autoboxing:
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Marco";

        //utilizzo l'unboxing:
        if(a==true){
            System.out.println("E' vero");
        }

        if(b=='@'){
            System.out.println("E' vero");
        }

        if(c==123){
            System.out.println("E' vero");
        }

        if(d==3.14){
            System.out.println("E' vero");
        }
        
        if(e=="Marco"){
            System.out.println("E' vero");
        }

    }
}
