
public class Celsius_To_Fah {
	public static void main(String arg[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please Enter a celsius:");
		int c = sc.nextInt();
		float f = (float)c*9/5+32;
		
		System.out.println("Fahrenheit="+f);
		
		sc.close();
}
}