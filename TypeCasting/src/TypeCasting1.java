public class TypeCasting1 {
public static void main(String[] args) {

	int a= 10 ;
	double b =a;  //upcasting /widening/implicit
	System.out.println(a);
	System.out.println(b);
	 double x= 12.8;
	// int y = x;  // Error
	 int y = (int)x;  // Explicit / narrowing /downcasting

	 System.out.println(y);
}
}
