// Dimond
public class Pattern_Exp7 {
	public static void main(String[] args) {
		int a=9,b=1,c=4;
		for(int x=1;x<=a;x++) {
			for(int y=1;y<=c;y++) {
				System.out.print(" ");
			}
			for(int y=1;y<=b;y++) {
				System.out.print("*");
			}
			if(x<=a/2) {
				b+=2;
				c--;
		}
			else {
				b-=2;
				c++;
			}
			System.out.println();
		}
	
		
}
}