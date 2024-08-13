
public class ShorthandOperatorEx2 {
	public static void main(String[] args) {
		byte a= 12;
//Error a = a+5  ;     a= a+5 and  a+=5  both are not same in short hand internally type casting
		a +=5 ;   // a = (byte)(a+5);
        //a = (byte)(a+5);  // allowed
		System.out.println(a);
	}

}
