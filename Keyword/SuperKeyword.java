package Preparazione_esame.Keyword;

public class SuperKeyword {

    // super = questa parola chiave si riferisce alla classe principale
    //         di un oggetto molto simile alla parola chiave "this"

    public static void main (String[]args){

        Hero Superman = new Hero("Superman", 35, "può volare");
        Hero Batman = new Hero("Batman", 42, "protegge Ghotam");

        System.out.println(Superman.name);
        System.out.println(Superman.age);
        System.out.println(Superman.power);

        System.out.println(Batman.toString());
    }

}
