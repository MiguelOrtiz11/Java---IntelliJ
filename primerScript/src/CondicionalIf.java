public class CondicionalIf {
    public static void main(String[] args) {

        boolean tiempo = true;
        boolean energia = true;

        if (tiempo && energia) {
            System.out.println("Estudia para tu futuro :D");
        }


        boolean isBluetoothEnabled = true; // también podría ser false
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("Archivo enviado");
        }

    }
}
