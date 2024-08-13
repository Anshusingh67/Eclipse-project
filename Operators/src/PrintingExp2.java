
public class PrintingExp2 {
	public static void main(String[] args) {
		double a=25.674;
		int b=45;
		char c='h';
		String d="Rahul";
		boolean e=true;
		System.out.printf("%f\n",a);  //%f is use for the print floating point
		System.out.printf("%d\n",b);  //%d is use for the print integer number in integer we do not use capitad d beacause integer have not capital form
		System.out.printf("%c\n",c);  //%c  is use for the print character in capital(%C) and small(%c)
		System.out.printf("%s\n",d);  //%s is use for the string
		System.out.printf("%b\n",e);  // %b is use for print blooean
		
		
		System.out.printf("%f\n%d\n%c\n%s\n%b\n",a,b,c,d,e);
		System.out.format("%f\n%d\n%c\n%s\n%B\n",a,b,c,d,e);
	}
}
