
public class Assigment_Pattern_31 {
	public static void main(String[] args) {
		int line = 5;  
		int star = 4;
		for(int i=1;i<=line; i++)
		{
			
			
			for(int j=1;j<=star; j++)
			{
			if(i==1||j==1||j==star||i==line) {
				System.out.print("*");

			}else {
				System.out.print(" ");

			}
			}
			System.out.println();
			
			}
}
}