
public class DifferenceSumSquare {

	public static void main(String[] args) {
		
		int squaredSum = 0;
		int sumSquared = 0;
		int total = 0;
		
		for(int counter=1; counter<101; counter++){
			
			squaredSum = (int) (squaredSum + (Math.pow(counter, 2)));
			
		}
		
		System.out.println(squaredSum);
		
		for(int counter1=1; counter1<101; counter1++){
			
			sumSquared = (sumSquared + counter1);
			
		}
		
		sumSquared = (int)(Math.pow(sumSquared, 2));
		
		System.out.println(sumSquared);
		
		total = (sumSquared-squaredSum);
		
		System.out.println(total);

	}

}
