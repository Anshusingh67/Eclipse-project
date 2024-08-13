
public class primeRang {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please Enter a range to find the prime");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int x=n1; x<=n2;x++) 
		{
			boolean flag = false;
			if(x>1) {
			for(int i=2; i<=x/2;i++) {
			   if(x%i==0) {
					   flag = true;
					  break;
					  
				    }
				}	
				if(flag== false) {
					System.out.println(x);
				}
				
		}else {
			System.out.println("Invalid number");
			}		
		}
		sc.close();
		
	}

}
