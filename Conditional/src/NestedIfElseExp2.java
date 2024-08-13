
public class NestedIfElseExp2 {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter your number:");
	int a=sc.nextInt();
	System.out.println("Enter your number:");
	int b=sc.nextInt();
	
	if(a==b) {
		System.out.println("Both are equal!!");
	}else {
		if(a>b) {
			System.out.println(a+" Is Greater number");
		}else {
			System.out.println(b+" Is Greater number");
		}
	}
	
	System.out.println("Thanks for using APP");
	
	sc.close();
}
}
