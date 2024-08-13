
public class TypeCasting6 {
	public static void main(String[] args) {
		byte x = 14, y =50;
		//byte z = x+y;    //Error  // byte+ byte -> int 
		byte z =(byte) (x+y);
		System.out.println(z);
		
		
		short a = 14, b =50;
		//short z = x+y;    //Error  // short+ short -> int 
		short c =(short) (a+b);
		System.out.println(c);
		
		byte k= 18;
		//byte l= k+1; //Error //byte+int ->int
		byte l=(byte) (k+1);
		System.out.println(l);
	}

}
