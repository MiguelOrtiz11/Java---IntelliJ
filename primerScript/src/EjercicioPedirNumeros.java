import java.util.Scanner;

public class EjercicioPedirNumeros {
    public static void main(String[] args) {

        //Pedir numeros hasta que el usuario indique

        Scanner scr = new Scanner(System.in);

        int opc = -1;
        int num = 0;

        while (opc != 2){
            System.out.println("Ingrese un numero: ");
            num = scr.nextInt();

            System.out.println("Desea continuar (1 = si, 2= no)");
            opc = scr.nextInt();

        }

        System.out.println("El programa ha finalizado");

    }
}
