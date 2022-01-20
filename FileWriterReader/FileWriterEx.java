package Preparazione_esame.FileWriterReader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main (String[] args){

        try{
            FileWriter writer = new FileWriter("Poem.txt");
            writer.write("Le rose sono rosse \nLe viole sono blu \nViva le spose\nMa a me paici tu!");
            writer.append("\n(Una poesia di Marco)");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
