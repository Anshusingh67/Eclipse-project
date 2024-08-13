
public class Factorial {
static int  fact(int x) {
	int num = x;
	int fact= 1 ;
	for(int i=1;i<=num ;i++) {
		fact =fact*i;
	}
	return fact;
	}
	public static void main(String[] args) {
		int x =5;
		int c =fact(x);
		System.out.println(c+" is Factorial of "+x);

		}
		
	}




