
public class FunctinString {
	static String findOddEven(int x) {
		
		if(x%2==0) {
			return x+" is Even ";    
		}else {
			return x+" is Odd";    

		}
	}
	public static void main(String[] args) {
	int m= 28;
	String n =	findOddEven(m);
	System.out.println( n );
	System.out.println(findOddEven(19));
		


	}
}
