// TO DO: finish implementing the algorithm

// The Business Process you are to implement:
// write a Java Program to add the numbers 100 to 1
// count down by 3 each time
// add up each count down number we step over

public class NumberCounter{
	
	public static void main(String args[]){
		// do the least here
		// make classes and instantiate them 
		// and call their method to run the business processes
		NumberHandler nh = new NumberHandler();
		nh.AddNumberSeries(1, 100, 7);
	}
}

class NumberHandler{
	public int AddNumberSeries(int startNumber, int endNumber, int stepNumber){
		int Sum = 0;
		int currentNumber = endNumber;
		for ( ;  ; ){
			currentNumber -= stepNumber;
		}

		return Sum;
	}
}
