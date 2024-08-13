// side reverse triangle
public class Pattern_Exp2 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Plese Enter the no of Star in first line");
		int a = sc.nextInt();
		System.out.println("Please Enter the no of line");
		int b = sc.nextInt();
		for(int i=1;i<=b;i++) {
			for(int j=1; j<=a;j++) {
				System.out.print("*");
			}
			System.out.println("");
			a--;
		}
		sc.close();
	}
}
