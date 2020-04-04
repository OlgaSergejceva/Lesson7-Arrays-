
public class AvgMaxMin {

		//declare instance variables
		private int numbers[];
		private double avg;
		private int max;
		private int min;
		
		//constructor
		public AvgMaxMin() {
		}
		
		//setter
		public void setNumbers(int[] numbers) {
			this.numbers = numbers;
		}
		
		//getters
		public double getAvg() {
			return avg;
		}

		public int getMax() {
			return max;
		}

		public int getMin() {
			return min;
		}
		
		//calculations
		public void computeAvg() {
			int sum = 0;
			for(int i=0; i<numbers.length; i++) {
				sum = sum + numbers[i];
			}
			avg = (double)sum/numbers.length;
		}
		
		public void computeMax() {
			max = numbers[0];
			for (int i = 1; i<numbers.length; i++) {
				if(numbers[i]>max) {
				max = numbers[i];
				}
			}
		}

		public void computeMin() {
			min = numbers[0];
			for(int i = 1; i<numbers.length; i++) {
				if(numbers[i]<min) {
				min = numbers[i];
				}
			}
		}
		
		
}//end class


