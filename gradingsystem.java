import java.util.Scanner;

public class GLP {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int index = 0;
		int total = 0;
		
		System.out.println("Welcome To the Grade Classifier Program!");
		
		while (true) {
			
			System.out.print("How many subjects?: ");
			index = input.nextInt();
			
			if (index <= 0) {
				System.out.println("Cannot input below 1!\n");
			} else if (index >= 28){
				System.out.println("Cannot input above 27!\n");
			} else {
				break;
			}
			
			
		}

		
		int[] subj = new int[index];
		
		for(int i = 0; i < index; i++) {
					
			while (true) {
				
				System.out.printf("Grade [%d]: ", i+1);
				subj[i] = input.nextInt();
				
				if (subj[i] >= 60 && subj[i] <= 99) {
					
					break;
					
				} else if (subj[i] >= 100) {
					
					System.out.println("Cannot input more than 99!\n");
				
				} else if (subj[i] <= 59){
					System.out.println("Cannot input below 60!\n");
				}
					
			}
					
		}
		
        
        for (int k = 0; k < subj.length; k++) {
        	total += subj[k];
        }
        
        double average = (double) total / subj.length;
        
        System.out.println("Your average is: " + average);


        if (average >= 95) {
            System.out.println("Excellent! You got 'A'!");
        } else if (average >= 90) {
            System.out.println("Very Good! You got 'B+'!");
        } else if (average >= 85) {
            System.out.println("Very Good! You got 'B'!");
        } else if (average >= 80) {
            System.out.println("Satisfactory! You got 'C'!");
        } else if (average >= 75) {
            System.out.println("Fairly Satisfactory! You got 'C-'!");
        } else {
            System.out.println("Needs Special Help. You got 'F'!");
        }
        
        input.close();
	}
}