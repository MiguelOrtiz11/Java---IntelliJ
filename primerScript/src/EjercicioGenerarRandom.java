import java.util.Random;

public class EjercicioGenerarRandom {
    public static void main(String[] args) {

        // Generar numeros al azar

        //Primera forma
        int numero = 0;
        numero = (int) (Math.random() * 100);
        System.out.println(numero);

        //Segunda forma
        int Numero = 0;
        Random random = new Random();
        Numero =  random.nextInt(100);
        System.out.println(Numero);
    }
}
