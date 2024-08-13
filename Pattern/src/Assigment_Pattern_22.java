
public class Assigment_Pattern_22 {
	public static void main(String[] args) {
		int line = 9;  
		int star = 1;
		for(int i=1;i<=line; i++) {
			
			
			
			for(int j=1;j<=star; j++)
			{
			
			if(i==1||i==line||j==1||j==star) {
				System.out.print("*");;
			}else {
				System.out.print(" ");
			}
			}
			
			if(i<=line/2) {
			star++;
			}
			else {
				star--;

			}
			
			System.out.println("");
		}
}
}