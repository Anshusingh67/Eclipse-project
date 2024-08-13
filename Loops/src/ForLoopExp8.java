
public class ForLoopExp8 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please Enter Your number");
		int n = sc.nextInt();
		int mul = 1;
		for(int i=1; i<=n;i++) {
			mul = mul*i;
			System.out.print(i);

			if(i==n) {

			}
			else {
				System.out.print("*");
			}
		}
		System.out.println("= " + mul);
		sc.close();
	}

}
