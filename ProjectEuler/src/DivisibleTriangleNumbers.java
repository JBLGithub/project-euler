import java.awt.List;
import java.util.ArrayList;

public class DivisibleTriangleNumbers {

	public static void main(String[] args) {
		
		int nbFactor = 0;
		int currentFactor= 0;
		int count=2;
		int currTri=1;
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		while(nbFactor<500){
			
			nbFactor = 1;
			
			currTri=currTri+count;
			count++;
			
			//System.out.println(currTri);
			
			int factor = currTri;
			int count2 = 2;
			boolean prime = false;
			
			while(factor!=1){
				
				if(count2>5){
				
					if ((count2%2) != 0){
						
						if (((count2%10) == 1) || ((count2%10) == 3) || ((count2%10) == 7) || ((count2%10) == 9)){
							
							for(int count3=0; count3<primes.size(); count3++){
								
								if(count2==primes.get(count3)){
									
									prime = true;
									
								}
							}
								
							if(prime != true){
									
								boolean prime2=true;
									
								for(int count4=(count2-1); count4>2; count4--){
									if(count2%count4==0){
										
										prime2 = false;
										break;
										
									}
								}
									
								if(prime2==true){prime=true; primes.add(count2);}
									
							}
						}
					}
				}
				else{
					
					for(int count3=0; count3<primes.size(); count3++){
						
						if(count2==primes.get(count3)){
							
							prime = true;
							
						}
					}
						
					if(prime != true){
							
						boolean prime2=true;
							
						for(int count4=(count2-1); count4>2; count4--){
							if(count2%count4==0){
								
								prime2 = false;
								break;
								
							}
						}
							
						if(prime2==true){prime=true; primes.add(count2);}
							
					}
					
				}
				
				if(prime==true){
					
					//System.out.println(count2);
					
					int currentPow = 0;
					
					while(factor%count2==0){
						
						currentPow++;
						factor = factor/count2;
						
					}
					
					nbFactor = nbFactor*(currentPow+1);
					
					//if(nbFactor>currentFactor){ currentFactor=nbFactor; System.out.println(currentFactor); }
					
				}
				
				count2++;
				prime=true;
				
			}
			
		}
		
		System.out.println(nbFactor);
		System.out.println(currTri);

	}
}
