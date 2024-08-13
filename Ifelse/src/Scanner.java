
public class Scanner {
public static void main(String arg[]) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter a integer number");
	int a = sc.nextInt();
	
	System.out.println("Enter a Floating point number");
	float b = sc.nextFloat();
	
	System.out.println("Enter a Double number");
	double c = sc.nextDouble();
	
	System.out.println("Enter a String without space");
	String s = sc.next();
	sc.close();
	System.out.println(" Integer  number="+a);
	System.out.println(" Floating point number="+b);
	System.out.println(" Double  number="+c);
	System.out.println(" String  number="+s);  // it take only untill space accures
	


	
}
}
