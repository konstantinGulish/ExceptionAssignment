import java.util.Scanner;

public class Division {
        public static void main(String[] args) {

           try {
               int a, b, result;

               Scanner input = new Scanner(System.in);
               System.out.println("Input two integers");

               a = input.nextInt();
               b = input.nextInt();

               result = a / b;

               System.out.println("Result = " + result);
           }

           catch (ArithmeticException e){
               System.out.println("You can't divide by 0. " +
               "Please re-run the program.");
           }

           finally {
               System.out.println("finally block will execute.");
           }
        }
}
