// Space Side triangle
public class Pattern_Exp4 {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int a = 1;
			int b = 6;
			int c = 5;
			for(int i=1;i<=b;i++) {
				for(int j=1; j<=c;j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=a;j++) {
					System.out.print("*");
				}
				System.out.println("");
				a++;
				c--;
			}
			sc.close();
		}
	}



