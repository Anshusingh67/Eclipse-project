public class SwitchExp4{
	public static void main(String[] args) 
	{
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int  a = 2;
	final int x=  12;
	switch(a) {
	//case a:  Error Case must be constant
	
	case x:    	//using final keyword variable is allowed

	{
		System.out.println("Hello");
		break;
	}
	default:
	{
		System.out.println("Invalid!!");
		break;
	}
	
	}
	sc.close();
	
	}
}