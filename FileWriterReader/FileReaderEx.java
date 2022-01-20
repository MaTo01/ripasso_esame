package Preparazione_esame.FileWriterReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    
    // FileReader = leggi il contenuto di un file come un flusso di caratteri. uno per uno
    //              read() returns un valore int che contiene il peso in byte del file
    //              quando read() returns -1, vuol dire che non c'è nulla da leggere

    public static void main(String[] args){

        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

}
