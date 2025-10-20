import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FibonacciApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the first value: ");
                int firstValue = scanner.nextInt();

                System.out.print("Enter the value range: ");
                int numTerms = scanner.nextInt();

                if (numTerms < 0) {
                    System.out.println("Number of terms must be non-negative. Try again.");
                    continue;
                }
                List<Integer> fibSequence = generateFibonacci(firstValue, numTerms);
                System.out.println("Fibonacci sequence starting from " + firstValue + " with " + numTerms + " terms: " + fibSequence);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        scanner.close();
    }
    public static List<Integer> generateFibonacci(int start, int numTerms) {
        List<Integer> sequence = new ArrayList<>();
        
        if (numTerms <= 0) {
            return sequence;
        }
        sequence.add(start);
        if (numTerms == 1) {
            return sequence;
        }
        sequence.add(start + 1);
        for (int i = 2; i < numTerms; i++) {
            sequence.add(sequence.get(i - 1) + sequence.get(i - 2));
        }
        return sequence;
    }
}