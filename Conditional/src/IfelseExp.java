
public class IfelseExp {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Your number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Your number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Your number:");
		int num3 = sc.nextInt();

		System.out.println("Enter Your number:");
		int num4 = sc.nextInt();
		
		if(num1==num2 && num1==num3 && num1== num4) {
			System.out.println("All are equal!");
		}else if(num1>num2 && num1>num3 && num1> num4) 
		{
			System.out.println(num1 +" it is greater");
		}else if(num2>num1 && num2>num3 && num2> num4)
		{
			System.out.println(num2 +" it is greater");
		
		}
		else if(num3>num1 && num3>num1 && num3> num4) 
		{
		System.out.println(num3 +" it is greater");
		}else {
			System.out.println(num4 +" it is greater");

		}
		System.out.println("Thank you||");
		sc.close();

		
		
}
}