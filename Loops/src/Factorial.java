
public class Factorial {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter Your number");
	int n = sc.nextInt();
	int f= 1;
	for(int i =1 ; i<=n;i++) {
		f = f*i;
	}
	sc.close();
	System.out.println("Factorial:"+f);
}
}
