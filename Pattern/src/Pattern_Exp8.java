// space side triangle and reverse side trianle
public class Pattern_Exp8 {
public static void main(String[] args) {
	int a= 9;
	int b = 1;
	int c = 4;
	for(int i=1; i<=a;i++) {
		for(int j=1;j<=c;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=b;j++) {
			System.out.print("*");

		}
		System.out.println();
		if(i<=a/2) {
			c--;
			b++;
		}else {
			c++;
			b--;
		}
	}
	
}

}

