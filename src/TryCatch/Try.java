package TryCatch;

//En esta clase habrá un ejemplo de la excepcion try-catch, la cual se explicará a detalle en el readme

public class Try {

    public static void main(String[] args) {

        String cadena = "Hello Word";

        int num;

        try {
            num = Integer.parseInt(cadena);
            System.out.println("Dato convertido"+ num);

        }catch (NumberFormatException e){
            System.out.println("No es un numero, es una cadena");
        }
    }

}
