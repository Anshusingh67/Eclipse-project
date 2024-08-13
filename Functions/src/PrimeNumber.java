
public class PrimeNumber {
	static boolean prime( int x) 
	{
		 if(x>1) {
			 boolean flag = true;
			 for(int i =2; i<=x/2;i++) 
			 {		 
				 if(x%i==0)
				 {
					flag =false;
					break;
					}	
			 }
			return flag;

		 }else {
			 System.out.println("Invalid");
			 return false;
		 }
	}
	
	public static void main(String[] args) {
		int y =9;
		boolean x = prime(y);
		if(x) {
			System.out.println(y+" is prime");
		}else {
			System.out.println(y+" is not prime");
		}
	}

}
