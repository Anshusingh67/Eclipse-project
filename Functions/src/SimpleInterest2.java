
public class SimpleInterest2 {
	static double  simpleIntrest(double p,double r,double t) {
		

		double si = (p*r*t)/100;
		return si;
	}
public static void main(String[] args) {
java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.println("ENter Principale amount");
double p = sc.nextDouble();
System.out.println("ENter rate");
double r = sc.nextDouble();
System.out.println("ENter time");
double t = sc.nextDouble();
double  simple= simpleIntrest(1334,23,6);
System.out.println("Simple Interest "+simple);
System.out.println("Simple Interest "+simpleIntrest(p,r,t));
		
	}
}

