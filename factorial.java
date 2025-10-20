import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Factorial of a number\n");
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("The factorial of " + num + " is " + factorial + ".");

        scanner.close();
    }
}