public class Main {
    public static void main(String[] args) {

        System.out.println("Expresiones regulares");

        //Valores enteros
        int a = 5;
        int b = 10;

        //Valores con decimales
        double i = 4.1;
        double j = 3.5;

        //Redondea hacia arriba
        System.out.println("Redondea hacia arriba");
        System.out.println(i + " = " + Math.ceil(i));

        //Redondea hacia abajo
        System.out.println("Redondea hacia abajo");
        System.out.println(j + " = " + Math.floor(j));

        //Devuelve el valor mayor
        System.out.println("Devuelve el valor mayor");
        System.out.println("a = " + a + " b = "+ b + " => " + Math.max(a, b));

        //Imprime un numero elevado a otro
        System.out.println("Imprime un numero elevado a otro");
        System.out.println("a = " + a + " b = "+ b + " => " + Math.pow(a, b));

        //Devuelve el valor absoluto de un argumento dado
        System.out.println("Devuelve el valor absoluto de un argumento dado");
        System.out.println(j + " = " + Math.abs(j));

        //Devuelve la suma de sus argumentos
        System.out.println("Devuelve la suma de sus argumentos");
        System.out.println("a = " + a + " b = "+ b + " => " + Math.addExact(a, b));

        //Devuelve la tangente del arco de un angulo (-pi/2 y pi/2)
        System.out.println("Devuelve la tangente del arco de un angulo (-pi/2 y pi/2)");
        System.out.println(j + " = " + Math.atan(j));

        //Devuelve la raiz cubica de un valor double
        System.out.println("Devuelve la raiz cubica de un valor double");
        System.out.println(i + " = " + Math.cbrt(i));

        //Devuvleve el coseno hiperbolico de un valor double
        System.out.println("Devuvleve el coseno hiperbolico de un valor double");
        System.out.println(j + " = " + Math.cosh(j));

        //Devuelve el coseno trigonometrico de un angulo
        System.out.println("Devuelve el coseno trigonometrico de un angulo");
        System.out.println(j + " = " + Math.cos(j));

        //Devuelve el numero elevado a la potencia de un valor double
        System.out.println("Devuelve el numero elevado a la potencia de un valor double");
        System.out.println(i + " = " + Math.exp(i));


    }
}
