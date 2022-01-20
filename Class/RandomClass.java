package Preparazione_esame.Class;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args){
        Random random = new Random();
        int x = random.nextInt(); //numero casuale non limitato
        int y = random.nextInt(100); // numero casuale da 0 a 99;
        double z = random.nextDouble(); //numero a virgola mobile casuale
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
