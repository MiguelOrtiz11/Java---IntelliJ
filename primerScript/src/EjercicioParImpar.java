import java.util.Scanner;

public class EjercicioParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " es par");
        }else {
            System.out.println(num + " es impar");
        }

    }
}
