
public class pythagoreanTriplet {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		int[] array = findMN();
		int m = array[0];
		int n = array[1];
		
		int i = 1;
		
		while (i>0){
			
			a = (int)((Math.pow(n, 2)) - (Math.pow(m, 2)));
			b = (int)(2*n*m);
			c = (int)((Math.pow(n, 2)) + (Math.pow(m, 2)));
			
			if ((a+b+c) == 1000){
				
				int result = a*b*c;
				System.out.println("product abc = " + result);
				System.out.println("a+b+c = " + a+b+c);
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
				i=0;
			}
			else{
				
				m++;
				n++;
				
			}
		}
	}
			

	
	public static int[] findMN(){
		
		int m1 = 0;
		int n1 = 1;
		int mE = 0;
		int nE = 0;
		
		outline:
		
		for (int counter1=m1; counter1<500; counter1++){
		
			for (int counter=n1; counter<500; counter++){
			
				if ((counter*(counter+counter1)) == 500){
					
					mE = counter1;
					nE = counter;
					break outline;
				}
			}
			m1++;
			n1++;
		}
		
		System.out.println("m = " + mE);
		System.out.println("n = " + nE);
		
		int[] array = new int[2];
		
		array[0] = mE;
		array[1] = nE;
		
		return array;
	}
}