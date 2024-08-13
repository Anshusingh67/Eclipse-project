
public class TypeCasting3 {
public static void main(String[] args) {
    System.out.println(12);  //by default in programming integer value is int
    System.out.println(45.6);
    
  //  float  a= 45.6;  //Error
     
    float  a= (float)45.6;  //allowed
    float  b= 45.6f;        //allowed
    float  c= 45.6F;       //allowed

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

	double x= 45.6;           //By default floating point is double
	double y= 45.6d;          //allowed
	double z= (double)45.6;   //allowed
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);

}
}
