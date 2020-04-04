import java.util.Scanner;
public class CalcApp {

	public static void main(String[] args) {
		
		int numbers[];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		
		int size = input.nextInt();
		
		numbers = new int[size];
		
		//input
		for(int i = 0; i<size; i++) {
			System.out.println("Enter value " + (i+1));
			numbers[i] = input.nextInt();
		}
		
		//processing
		AvgMaxMin avgmaxmin = new AvgMaxMin();
		avgmaxmin.setNumbers(numbers);
		avgmaxmin.computeAvg();
		avgmaxmin.computeMax();
		avgmaxmin.computeMin();
		
		//output
		double a = avgmaxmin.getAvg();
		double b = avgmaxmin.getMax();
		double c = avgmaxmin.getMin();
				
		System.out.println("Average is: " + a);
		System.out.println("Max is: " + b);
		System.out.println("Min is: " + c);
	}

}
