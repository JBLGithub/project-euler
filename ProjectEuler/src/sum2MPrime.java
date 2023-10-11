import java.util.*;

public class sum2MPrime {

	public static void main(String[] args) {

		int range = 2000000;
		
		System.out.println(range);
		
		long sum = 10;
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(2);
		array.add(3);
		array.add(5);
		
		for (int counter=6; counter<range; counter++){
			
			boolean value = even(array,counter);
			
			if (value==false){
				
				System.out.println(counter);
				array.add(counter);
				sum = sum+counter;
			}
		}
		System.out.println(sum);
	}

	public static boolean even(ArrayList<Integer> array,int nb){
		
		boolean value = true;
		
		if ((nb%2) != 0){
			
			if (nb>5){
				
				if (nb>5 && ((nb%10) == 1) || ((nb%10) == 3) || ((nb%10) == 7) || ((nb%10) == 9)){
					
					if (testPrime(array,nb) == true){
						value = false;
					}
				}
			}	
		}	
		return value;	
		
	}
	
	public static boolean testPrime(ArrayList<Integer> array,int nb){
		
		boolean value = true;
		
		for(int counter=0; counter<array.size(); counter++){
			
			if ((nb%array.get(counter)) == 0){
				
				value = false;
			}
			if (((int) Math.sqrt(nb)) < array.get(counter)){
				break;
			}
		}
		return value;
	}
}
