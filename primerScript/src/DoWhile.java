import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {

         int response = 0;

         do {
             System.out.println("Select any option: ");
             System.out.println("1. Movies");
             System.out.println("2. Series");
             System.out.println("0. Exit");

             Scanner read = new Scanner(System.in);
             response = Integer.valueOf(read.nextInt());

             switch (response){
                 case 0:
                     System.out.println("Thanks for visit");
                     break;
                 case 1:
                     System.out.println("Select Movies");
                     break;
                 case 2:
                     System.out.println("Select Series");
                     break;
                 default:
                     System.out.println("Select a correct option");
             }
         }while (response != 0);



    }
}
