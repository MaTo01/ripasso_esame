package Preparazione_esame.Keyword;

public class StaticKeyword {
    
    //static = modificatore. una sola copia di una variabile/metodo viene
    //         creata e condivisa

    //         la classe "possiede" il membro statico

    public static void main (String[] args){
        
        Friend friend1 = new Friend("Matteo");
        Friend friend2 = new Friend("Marco");
        Friend friend3 = new Friend("Massimiliano");

        System.out.println(Friend.numberOfFriends);
        
        Friend.displayFriends();

    }
}

class Friend{

    String name;

    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("Hai "+numberOfFriends+" amici");
    }
}