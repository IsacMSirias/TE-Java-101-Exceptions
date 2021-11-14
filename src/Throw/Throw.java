package Throw;

//En esta clase habrá un ejemplo de la excepcion throw, la cual se explicará a detalle en el readme

public class Throw {

    private void first() {
        try {
            second();
        } catch (Exception e) {

        }
    }

    private void second(){
        try{
            third();
        }catch (Exception e){
            System.out.println("Metodo dos" + e.getMessage());
        }
    }

    private void third() throws Exception {
        try{
            int division = 1/0;
        }catch (Exception e){
            throw e;
        }

    }

    public static void main(String[] args) {
        Throw trw = new Throw();
        trw.first();
    }

}
