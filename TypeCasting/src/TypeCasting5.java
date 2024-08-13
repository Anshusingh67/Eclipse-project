
public class TypeCasting5 {
	public static void main(String[] args) {
		int x =15;
		//byte y= x  Error
		byte y = (byte)x;
		byte z = 19;   // it is with in int and byte so that intarnal type casting
		System.out.println(y);
		System.out.println(z);
	}

}
