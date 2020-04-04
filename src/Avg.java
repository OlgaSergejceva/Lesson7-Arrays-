
public class Avg {
	//declare instance variables
	private int numbers[];
	private double average;
	
	public Avg() {
	}
	
	public void setNumbers(int[] num) {
		numbers = num;
	}
	
	//compute the average of all the numbers from []
	public void calculateAverage() {
		int sum;//to store the sum of all the elements
		int currentElement;//to store the current element from the array
		
		sum=0;
		for(int i=0; i<numbers.length; i++) {
			//retrieve the element at index i
			//currentElement = numbers[i]
			//update the sum
			sum = sum + numbers[i];
		}
		//compute
		average = (double)sum/numbers.length;
	}
	
	//getter
	public double getAverage() {
		return average;
	}
}
