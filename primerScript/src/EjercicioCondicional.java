public class EjercicioCondicional {
    public static void main(String[] args) {

        boolean bleState = true;
        boolean deviceOn = true;

        if (bleState) {
            System.out.println("Bluetooth is enabled");
        } else if (bleState && deviceOn) {
            System.out.println("Bluetooth is enabled again");
        } else {
            System.out.println("Bluetooth is not enabled");
        }
    }
}

