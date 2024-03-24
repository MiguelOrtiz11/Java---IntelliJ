public class BucleWhile {
    static boolean isTrueOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();
        int i = 1;
        while (isTrueOnLight && i <= 10) {
            printSos();
            i++;
            turnOnOffLight(); // Llamada para cambiar el estado de la luz
        }
    }

    public static void printSos() {
        System.out.println("... _ _ _ ...");
    }

    public static void turnOnOffLight() {
        isTrueOnLight = !isTrueOnLight; // Simplificación de la lógica para cambiar el estado de la luz
    }
}
