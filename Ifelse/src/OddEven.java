
public class OddEven {

	public static void main(String arg[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please Enter a number:");
		int a = sc.nextInt();
		
	
		if(a%2==0) {		
			System.out.println("the number is even ="+a);
			}
		else {		
			System.out.println("the number is Odd ="+a);
            }
		System.out.println("Thank you");
		
		sc.close();
		
		
	}

}





