package Preparazione_esame.String;

public class Car {
    
    String marca = "Lamborghini";
    String modello = "Huracan";
    int anno = 2020;
    String color = "verde";
    double prezzo = 150000.00;

    void guida(){
        System.out.println("Guida");
    }
    
    void frena(){
        System.out.println("Frena!");
    }

    public String toString(){
        
        String myString = marca +"\n"+ modello +"\n"+ anno +"\n"+ color +"\n"+ prezzo;
        return myString;

    }

}
