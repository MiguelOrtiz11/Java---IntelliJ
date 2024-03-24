public class CondicionalElse {
    public static void main(String[] args) {

        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            System.out.println("El Bluetooth no está activado");
        }

    }
}
