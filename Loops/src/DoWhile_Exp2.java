
public class DoWhile_Exp2 {	
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	String choice;
	do {		
		System.out.println("please Enter number");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");

		}
		System.out.println("DO you wnat to print anothr Squre type yes/no");
		 choice = sc.next();
	}while(choice.equalsIgnoreCase("yes"));
	System.out.println("Thank you");
}
}


