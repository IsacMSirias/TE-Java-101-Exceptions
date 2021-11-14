package Finally;
import java.util.InputMismatchException;
import java.util.Scanner;

//En esta clase habrá un ejemplo de la excepcion try-catch, la cual se explicará a detalle en el readme

public class Finally {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;

        System.out.println("Ingrese un numero entero");

        try{

            x = scanner.nextInt();
            System.out.println(x);

        }catch (InputMismatchException e){
            System.out.println("No se ha ingresado un valor entero");
        }
        finally {
            System.out.println("Ejecucion terminada");
        }
    }

}
