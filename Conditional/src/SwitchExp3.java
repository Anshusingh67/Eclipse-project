
public class SwitchExp3 {
public static void main(String[] args) {
		
		switch(2) {
			case 1:
				System.out.println("Hello");
				break;
			case 2+9:
			//case "2"://error // mismatched Error
				System.out.println("Hi");
				break;
			case 3:
				System.out.println("Bye");
				break;
			default:
				System.out.println("Invalid Number");
		}
		System.out.println("Thanks for using APP");
	}
}
