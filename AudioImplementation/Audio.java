package Preparazione_esame.AudioImplementation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Audio {
    //accetta solo file audio di tipo .wav
    public static void main(String[]args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        Scanner in = new Scanner(System.in);

        File file = new File("Straw.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("P = Play, S = Stop, R = Reset, Q= Quit");
            System.out.println("scegli il comando da eseguire");

            response = in.next();
            response = response.toUpperCase();

            switch(response){

                case("P"): clip.start();
                break;
                case("S"): clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition('0');
                break;
                case("Q"): clip.close();
                break;
                default: System.out.println("scelta non valida");

            }
        }

        in.close();

    }
}
