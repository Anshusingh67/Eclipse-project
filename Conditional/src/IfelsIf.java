
public class IfelsIf {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Please enter Your Age");
	int a = sc.nextInt();
	if(a<0 || a>120)
	{
		System.out.println("Invalid Age!!");
	}else if(a<4) {
		System.out.println("You Are Infant!");

	}else if(a<13) {
	System.out.println("You Are Kid");
	}else if(a<=19) {
		System.out.println("You Are Teenager");
	}else if(a<=50) {
		System.out.println("You Are Adult");

	}else if(a<=80)
	{
		System.out.println("You Are old");

	}else {
		System.out.println("You Are Oldage");

	}
	System.out.println("Thanks");

	
}
}
