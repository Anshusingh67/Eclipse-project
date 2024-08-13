
public class Assigment_Pattern_21 {
	public static void main(String[] args) {
		int line = 9;  
		int star = 1;
		int space = 4;
		for(int i=1;i<=line; i++) {
			
			for(int j=1;j<=space; j++)
			{
				System.out.print(" ");
			}
			
			
			for(int j=1;j<=star; j++)
			{
			
			if(i==1||i==line||j==1||j==star) {
				System.out.print("*");;
			}else {
				System.out.print(" ");
			}
			}
			
			if(i<=line/2) {
			star+=2;
			space--;}
			else {
				star-=2;
				space++;
			}
			
			System.out.println("");
		}
}
}
