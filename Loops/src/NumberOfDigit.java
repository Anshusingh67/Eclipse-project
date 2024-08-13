
public class NumberOfDigit {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Your number");
		int n = sc.nextInt();
		int c=0;
		while(n!=0) {
			n/=10;
			c++;
		}
		System.out.println("Number of digit: "+c);

		sc.close();
}
}