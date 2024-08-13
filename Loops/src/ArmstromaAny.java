
public class ArmstromaAny {
	
public static void main(String[] args) {
	

	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Please Enter a range to find the prime");
	int x = sc.nextInt();

	int count = 0;
	int copy = x;
	int sum =0;
	while(x!=0) {
		x=x/10;
       count++;
	}
	x= copy;
	while(x!=0) {
		int rd = x%10;
		int m = 1;
		for(int i =1; i<=count;i++) {
			m*=rd;
		}
		sum+=m;
		x/=10;
}	
	x= copy;

	if(sum==copy) {
		System.out.println(x+"is Armstrom");
	}else {
		System.out.println(x+" is Not Armstrom");

	}
sc.close();
}
}