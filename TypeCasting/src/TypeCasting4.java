public class TypeCasting4 {
public static void main(String[] args) {
    long c = 200; //allowed with in range
	//long a= 20000000000;  // Error due to out of the range of int
	//long b =(long)20000000000;   //not allowed
	long b =20000000000l;        //allowed
	long a =20000000000L;       //allowed

	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);


}
}
