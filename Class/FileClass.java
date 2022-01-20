package Preparazione_esame.Class;
import java.io.File;

public class FileClass {

    // File = una rappresentazione astratta di file e percorsi di directory

    public static void main(String[]args){
        
        //File file = new File("C:\\Users\\utente\\.vscode\\java\\Preparazione_esame\\Class\\secret_message.txt");
        File file = new File("secret_message.txt");

        if(file.exists()){
            System.out.println("Il file è esistente");
            System.out.println(file.getPath()); // mostra a display il nome del file
            System.out.println(file.getAbsolutePath()); //mostra a display il percorso del file
            System.out.println(file.isFile()); // se è un file: TRUE altrimenti: FALSE
            file.delete(); //elimina il file
        }
        else{
            System.out.println("Il file non esiste");
        }
    }
}
