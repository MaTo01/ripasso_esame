package Preparazione_esame.Methods;

public class Methods {
    
    // method = un blocco di codice che viene eseguito ogni qual volta
    //          che viene richiamato nella classe principale

    public static void main (String[] args){

        String name = "Marco";
        int age = 20;

        hello(name, age);

        int x = 3;
        int y = 4;

        System.out.println("la somma tra x e y è: "+somma(x, y));

    }

    static void hello(String name, int age) {  //void se non restituisco nulla
       
        System.out.println("Ciao " + name);
        System.out.println("Hai " + age + " anni");

    }

    static int somma(int x, int y){ //se voglio dare un return devo avere due
    //                                parametri di tipo uguale e usare quel tipo anzichè "void"    
        
        int z = x+y;
        return z;

    }



}
