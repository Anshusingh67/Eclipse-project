
public class Fibonaci {

public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter Your number");
	int n = sc.nextInt();
	int  a= 0;
	int b = 1;
	System.out.println(a);
	System.out.println(b);
	for(int i =3; i<=n;i++) {
		int temp =a;
		a= b;
		b=temp+a;
		System.out.println(b);
	}
	sc.close();

}
}
