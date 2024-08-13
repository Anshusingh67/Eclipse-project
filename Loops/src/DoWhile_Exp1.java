
public class DoWhile_Exp1 {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	String choice;
	do {		
		System.out.println("please Enter number");
		int n = sc.nextInt();
		int squre = n*n;
		System.out.println("Squre of "+ n + "is:"+squre);
		System.out.println("DO you wnat to print anothr Squre type yes/no");
		 choice = sc.next();
	}while(choice.equalsIgnoreCase("yes"));
	System.out.println("Thank you");
}
}
