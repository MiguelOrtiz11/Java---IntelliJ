public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean condicionA = true; // verdadero
        boolean condicionB = false; // falso

        boolean condicionC = 2 + 2 == 4; // verdadero
        boolean condicionD = 2 + 2 == 5; // falso

        boolean condicionE = "Pepito" == "Pepito"; // verdadero
        boolean condicionF = "Pepito" == "Pepe"; // falso

        // Ejemplo
        int a = 8;
        int b = 5;

        // Operadores asignación
        System.out.println("a es igual a b ? → > " + (a == b));
        System.out.println("a es diferente a b? →> " + (a != b));

        // Operadores relacionales
        System.out.println("a es mayor a b? →> " + (a > b));
        System.out.println("a es menor a b? →> " + (a < b));


    }
}
