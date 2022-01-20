package Preparazione_esame.Array;

public class Array2D {
    
    // 2D Array = un array dentro un'altro array, serve per creare una tabella

    public static void main (String[]args){
        String[][] cars = new String[3][3]; //sto creando una tabella da 3*3

        // modo alternativo per inizializzare un array 2D:
        //String[][] cars =   {
        //                        {"Camaro","Corvette","Silverado"},
        //                        {"Mustang","Alfa","Opel"},
        //                        {"Fiat","Lancia","Corsa"}
        //                    };

        cars[0][0]= "Camaro";
        cars[0][1]= "Corvette";
        cars[0][2]= "Silverado";
        cars[1][0]= "Mustang";
        cars[1][1]= "Alfa";
        cars[1][2]= "Opel";
        cars[2][0]= "Fiat";
        cars[2][1]= "Lancia";
        cars[2][2]= "Corsa";

       
        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
        }



    }
}
