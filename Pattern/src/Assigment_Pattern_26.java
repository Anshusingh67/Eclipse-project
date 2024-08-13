
public class Assigment_Pattern_26 {
	public static void main(String[] args) {
		int line = 9;  
		int star = 1;
		int space = 8;
		for(int i=1;i<=line; i++)
		{
			
			
			for(int j=1;j<=star; j++)
			{
			
			System.out.print("*");
			}
			
			for(int j=1;j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star; j++)
			{
			
			System.out.print("*");
			}
			if(i<=line/2) {
				space-=2;
				star++;
			}else {
				space+=2;
				star--;
			}
			
			

			System.out.println("");
		}
}
}
