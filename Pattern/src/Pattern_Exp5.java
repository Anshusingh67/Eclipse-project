//space reverse  side triangle
public class Pattern_Exp5 {
public static void main(String[] args) {
			int a = 6;
			int b = 6;
			int c = 0;
			for(int i=1;i<=b;i++) {
				for(int j=1; j<=c;j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=a;j++) {
					System.out.print("*");
				}
				System.out.println("");
				a--;
				c++;
			}
	

	}
}
