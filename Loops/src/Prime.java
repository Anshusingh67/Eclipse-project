
public class Prime {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter Your number");
	int n = sc.nextInt();
	boolean f = false;
	if(n>1) {
		for(int i =2 ; i<=n/2;i++) {
			if(n%i==0) {
				f = true;
				break;
			}
	}
		if(f==true) {
			System.out.println(n+" is not prime");
		}else {
			System.out.println(n+" is prime");
		}
		}
	else {
		System.out.println("Invalid data input");
	}

	
	sc.close();
	System.out.println("Flag:"+f);

}
}
