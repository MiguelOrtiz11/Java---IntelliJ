import java.util.Scanner;

public class EjercicioTablasMulti {
    public static void main(String[] args) {

        // Imprimir las tablas de multiplicar

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Tabla del " + num);

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
