
public class Assigment_Pattern_3 {
public static void main(String[] args) {
	int line = 5;  
	int star = 5;
	for(int i=1;i<=line; i++) {
		for(int j=1;j<=star; j++) {
			System.out.print("*");
		}
		star--;
		System.out.println("");
	}
}
}
