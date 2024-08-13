
public class SwitchExp2 {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter your number");
	String s = sc.next();
	switch(s) {
	case "Mohan":
	{
	System.out.println("Hello");
	break;
	}
	case "Ram":
   //case 2://error   mismatch of the data type

	{
	System.out.println("Hi");
	break;
	}
	case "Rohan":
	{
	System.out.println("Bye");
	break;
	}

	default :{
		System.out.println("Invalid number!");
	}
	}
	System.out.println("Thank you using this app");
	sc.close();
}
}

