
public class Assigment_Pattern_18 {
	public static void main(String[] args) {
		int line = 5;  
		int star = 5;
		int space = 0;
		for(int i=1;i<=line; i++) {
			for(int j=1 ;j<=space;j++) {
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
			star--;
			space++;
			System.out.println("");
		}
	}
}
