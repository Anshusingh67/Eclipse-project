
public class NestedIfElseExp3 {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter your number:");
	int a=sc.nextInt();
	System.out.println("Enter your number:");
	int b=sc.nextInt();
	System.out.println("Enter your number:");
	int c=sc.nextInt();
	
	if(a==b && b==c) 
	{
		System.out.println("All are equal!!");
	}
	else 
	{
		if(a>b) {
			if(a>c)
			{
			System.out.println(a+" Is Greater number");
			}else 
			{
			System.out.println(c+" Is Greater number");
			}
			     
	}   else {
			if(b>c) 
			{
			System.out.println(b+" Is Greater number");
			  }
			 else 
			 {
			System.out.println(c+" Is Greater number");
			   }
		
	}
	}
	System.out.println("Thanks for using APP");
	
	sc.close();

}
}

