import java.util.Scanner;
public class AvgApp {

	public static void main(String[] args) {
		//declare [] to store integer elements
		int numbers[];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		
		int size = input.nextInt();
		
		numbers = new int[size];
		
		//input
		//loop to prompt the user to input the number
		//in each iteration of loop to store number provided by the user in the numbers[] at the index i
		for(int i = 0; i<size; i++) {
			System.out.println("Enter value " + (i+1));
			numbers[i] = input.nextInt();
		}
		
		//processing
		AvgMax avgMax = new AvgMax();
		//use the setter to store the numbers provided by the user
		avgMax.setNumbers(numbers);
		avgMax.computeMax();
		
		Avg avg = new Avg();
		avg.setNumbers(numbers);
		avg.calculateAverage();
		
		AvgMin min = new AvgMin();
		min.setNumbers(numbers);		
		min.calculateMin();
		
		//output
		double a = avg.getAverage();
		double b = avgMax.getMax();
		double c = min.getMin();
		
		System.out.println("Average is: " + a);
		System.out.println("Max is: " + b);
		System.out.println("Min is: " + c);

	}//end main

}//end class
