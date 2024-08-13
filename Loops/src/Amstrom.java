
public class Amstrom {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter a three digit number");
	int n = sc.nextInt();
	int copy = n;
	int c =0;
	while(n!=0)
	{
	int r = n%10;
	c = c+r*r*r;
	n/=10;
	}
	
	if(copy==c) {
		System.out.println("Amstrom");
	}else {
		System.out.println("Not Amstrom");

	}
	sc.close();
	
	
	
}
}
