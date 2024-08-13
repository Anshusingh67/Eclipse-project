
public class SumDigit {
public static void main(String[] args) {

	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter Your number");
	int n = sc.nextInt();
	int  sum= 0;
	while(n!=0) {
	   int r =n%10;
         sum = sum+r;
         n/=10;
	}
	System.out.println(sum);

	sc.close();

}
}
