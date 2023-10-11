
public class divisibleTrianNb {

	public static void main(String[] args) {
		
		int number = 0;
		int counter = 1;
		boolean found = false;
		
		while (found == false){
			
			/*
			number = number + counter;
			 
			
			counter++;
			
			System.out.println(number);
			
			if (number > 28){
				
				found = true;
				
			}
			
			*/
			
			if ((number%2) != 0){
				
				if (number>5){
					
					if (number>5 && ((number%10) == 1) || ((number%10) == 3) || ((number%10) == 7) || ((number%10) == 9)){
						
						System.out.println(number);
						}
					}
				}
			
			number++;
			
			if (number > 28){
				
				found = true;
				
			}
		}
	}
}
