public class Arreglos {
    public static void main(String[] args) {

        //Creacion del arreglo "galletas"
        String[] galletas = {"Oreo", "", "Galletitas saladas", "mantequilla"};

        System.out.println("Cantidad de valores en el arreglo: " + galletas.length);// cantidad de galletas
        System.out.println("la galleta " + galletas[0] + " Es la más rica");

        String[][] cities = new String[4][2];

        /*               2
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |  4
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */

        /**
         *cities[0][0] = "Mexico";
         *cities[0][1] = "Mexico";
         *cities[0][2] = "Colombia";
         *cities[0][3] = "Colombia";
         *cities[1][0] = "CDMX";
         *cities[1][1] = "Guadalajara";
         *cities[1][2] = "Bogota";
         *cities[1][3] = "Medellin";
         **/

        int x = 1;
        while (x <= 10) System.out.println(++x);


    }
}
