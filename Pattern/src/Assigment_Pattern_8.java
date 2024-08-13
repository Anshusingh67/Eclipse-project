
public class Assigment_Pattern_8 {
	public static void main(String[] args) {
		int line = 9;  
		int star = 1;
		for(int i=1;i<=line; i++) {
			
			for(int j=1;j<=star; j++)
			{
				System.out.print("*");
			}
			if(i<=line/2) {
				star++;	
			}else {
				star--;
			}
			
			System.out.println("");
		}
	}
}
