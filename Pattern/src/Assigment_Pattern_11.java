
public class Assigment_Pattern_11 {
	public static void main(String[] args) {
		int line = 5;  
		int star = 4;
		int space =0;
		for(int i=1;i<=line; i++) {
			for(int j=1;j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star; j++)
			{
				System.out.print("*");
			}
			space++;
			System.out.println("");
		}
	}
}

