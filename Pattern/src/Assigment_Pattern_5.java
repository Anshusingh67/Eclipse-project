
public class Assigment_Pattern_5 {
	
	public static void main(String[] args) {
	int line = 5;  
	int star = 1;
	int space =4;
	for(int i=1;i<=line; i++) {
		for(int j=1;j<=space; j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star; j++)
		{
			System.out.print("*");
		}
		star+=2;
		space--;
		System.out.println("");
	}
}
}