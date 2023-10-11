
public class SmallestNumber {

	public static void main(String[] args) {

		int number = 1;
		
		int i=1;;
		
		while(i>0){
			
			
			for(int counter=1; counter<21; counter++){
				
				if(number%counter != 0){
					
					number++;
					break;
				}
				else{
					
					if(counter==20){
						
						System.out.println(number);
						i = 0;
						break;
						
					}
					
				}
					
			}
				
		}
			
	}

}
