
public class TypeCasting2 {
public static void main(String[] args) {
	char a= 'h';
	int b = a;             //implicit / widning /
	System.out.println(a);
	System.out.println(b);
	
	int x=104;
	// char y = x;       // Error
	char y = (char)x;    //Explicit /narrowing /downcasting
	System.out.println(x);
	System.out.println(y);
}
}
