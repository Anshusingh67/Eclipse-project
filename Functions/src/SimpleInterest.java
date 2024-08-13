public class SimpleInterest {
		static double  simpleIntrest() {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("ENter Principale amount");
			double p = sc.nextDouble();
			System.out.println("ENter rate");
			double r = sc.nextDouble();
			System.out.println("ENter time");
			double t = sc.nextDouble();

			double si = (p*r*t)/100;
			return si;
		}
public static void main(String[] args) {
//	java.util.Scanner sc = new java.util.Scanner(System.in);
//	System.out.println("ENter Principale amount");
//	double p = sc.nextDouble();
//	System.out.println("ENter rate");
//	double r = sc.nextDouble();
//	System.out.println("ENter time");
//	double t = sc.nextDouble();
	double  simple= simpleIntrest();
	System.out.println("Simple Interest "+simple);
	System.out.println("Simple Interest "+simpleIntrest());
			
		}
}


