

public class SimpleIntrest {

	public static void main(String arg[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please Enter rate:");
		int r = sc.nextInt();
		
		System.out.println("Please Enter principle amount:");
		int p = sc.nextInt();
		
		System.out.println("Please Enter time:");
		int t = sc.nextInt();
		
		float Si = (float)(p*r*t)/100;
		System.out.println("cube of number is ="+Si);
		
		sc.close();
		
		
	}

}




