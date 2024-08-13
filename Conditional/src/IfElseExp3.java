public class IfElseExp3 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter 2 Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a+" is Greater.");
		}else {
			System.out.println(b+" is Greater.");
		}
		
		System.out.println("Thanks for using APP");
		
		sc.close();
	}

}