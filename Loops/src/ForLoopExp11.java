// natural number sequare
public class ForLoopExp11 {
	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int m=0;
		for(int a=1;a<=n;a++) {
			m += a*a;
			System.out.print(a*a);
//			System.out.print(a+"*"+a);
			if(a!=n) {
				System.out.print("+");
			}
		}
		System.out.println("="+m);
		sc.close();
}
}