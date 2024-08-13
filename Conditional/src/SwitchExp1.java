
public class SwitchExp1 {
public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	System.out.println("Enter your number");
	int num = sc.nextInt();
	switch(num) {
	case 1:
	{
	System.out.println("Jan");
	break;
	}
	case 3:
	{
	System.out.println("Fab");
	break;
	}
	case 4:
	{
	System.out.println("Mar");
	break;
	}
	case 2:
	{
	System.out.println("Apr");
	break;
	}
	case 6:
	{
	System.out.println("May");
	break;
	}
	case 7:
	{
	System.out.println("jun");
	break;
	}
	case 8:
	{
	System.out.println("jul");
	break;
	}
	case 9:
	{
	System.out.println("Aug");
	break;
	}
	case 10:
	{
	System.out.println("Sep");
	break;
	}
	case 11:
	{
	System.out.println("Oct");
	break;
	}
	case 12:
	{
	System.out.println("Nov");
	break;
	}
	case 13:
	{
	System.out.println("Dec");
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
