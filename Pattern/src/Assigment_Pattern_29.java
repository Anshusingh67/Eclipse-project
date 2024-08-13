
public class Assigment_Pattern_29 {

	public static void main(String[] args) {
		int line = 9;  
		int star = 5;
		int space = 0;
		for(int i=1;i<=line; i++) {
			
			for(int j=1;j<=space; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star; j++)
			{
				if(i==1||j==1||j==star||i==line) {
					System.out.print("*");
					System.out.print(" ");
				}
				else {
					System.out.print(" ");
					System.out.print(" ");

				}

			
			}
			
			if(i<=line/2) {
			star--;
			space++;
			}
			else {
				star++;
				space--;
			}
			
			System.out.println("");
		}
}


}


