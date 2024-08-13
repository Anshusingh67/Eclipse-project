
public class Greater {

	public static void main(String arg[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please Enter a number:");
		int a = sc.nextInt();
		
		System.out.println("Please Enter a number:");
		int b = sc.nextInt();
		if(a>b) {		
			System.out.println("the number is greater ="+a);
			}
		else {		
			System.out.println("the number is greater ="+b);
            }
		System.out.println("Thank you");
		
		sc.close();
		
		
	}

}







