
public class IncrementDecrementOpratorEx4 {
	public static void main(String[] args) {
		int a =10, b;
//		b = a++-5;         // a= 11 // b= 5
//		b =a++-a;          // a= 11 // b= -1
//      b = ++a-a+a++;     // a = 12  //b=11
//		b = --a+a++-a++-a; // a= 11 //b=-3
//		b =a--*a/3+a++%a*5/a--; // 10*9/3+9%10*5/10  // a= 9   //b=34
//		b = a+++a;     //b=21 // a=11
//		b = a++++a;  //Error
//		b = a+++++a; //Error -> a++ +++ a  it does nont make sens
//		b = a+++ ++a;   // a = 12 // b= 22
		b = a++-++a;    // a =12 // -2
		
		System.out.println(a);
		System.out.println(b);
	}

}
