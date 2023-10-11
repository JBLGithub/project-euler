
public class primeSt10001 {

	public static void main(String[] args) {
		
		int number = 3;
		int position = 1;
		int i = 1;
		
		while (i>0){
				
			for (int counter=2; counter<number; counter++){
				
				if(number%counter == 0){
					number++;
					break;
				}
				else{
					if((number%counter != 0) && (counter == (number-1))){
						
						//System.out.println(number);
						position++;
						number++;
						break;
						
					}
					
				}
			}
			
				
			if (position==10001){
				
				i=0;
				number--;
				System.out.println(number);
			}	
			
		}

	}

}
