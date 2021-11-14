package ExcepcionePropia;

import java.util.Scanner;

public class ExcepcionPropia {

    public static void main(String[] args) throws EdadExeption {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int edad = sc.nextInt();
        final int EdadMax = 100;

        if(edad<EdadMax){

            System.out.println("Hola, ¿Cómo estás?");

        }else{
            throw new EdadExeption("El valor ingrsado es invalido");
        }

    }

    private static class EdadExeption extends Exception {

        public String Mensaje;

        public EdadExeption(String Mensaje){

            this.Mensaje= Mensaje;

        }
    }
}




