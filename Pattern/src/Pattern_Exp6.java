
// Triangle 
public class Pattern_Exp6 {
public static void main(String[] args) {
	int a =4;
	int b = 1;
	int c = 3;
	for(int i =1 ;i<=a;i++) {
		
		for(int j = 1;j<=c;j++) {
			System.out.print(" ");
		}
		for(int j = 1;j<=b;j++) {
			System.out.print("*");
		}
		System.out.println();
		c--;
		b+=2;
	}
		
}
}
