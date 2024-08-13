
public class PrintingExp1 {
	
	public static void main(String[] args) {
		double a=25.6748286786;
		System.out.printf("%f\n",a); //maximum take six digite of decimal and round using %f
		System.out.format("%f\n",a);
		System.out.print(a+"\n");   //it print all the decimal value 
		System.out.println(a);     // it print all valve first and go to the next line 
		
   
		System.out.printf("%.2f\n",a);  // %f and all the character specifier is known as a formate specifier
		System.out.format("%.2f\n",a);  // .2 is use for print maximum 2 decimal point 
		System.out.printf("%.12f\n",a);
		System.out.format("%.12f\n",a);

}
}