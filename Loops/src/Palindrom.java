
public class Palindrom {

public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Your number");
		int n = sc.nextInt();
		int copy = n;
		int c=0;
		while(n!=0) {
			int r = n%10;
			c = 10*c+r;
			n/=10;
			
		}
System.out.println("Reverse number: "+c);
if(copy==c) {
	System.out.println("Palindrom");
}else {
	System.out.println("not palindrom");
}
		sc.close();
}
}

