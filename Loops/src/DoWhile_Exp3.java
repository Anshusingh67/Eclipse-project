
public class DoWhile_Exp3 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String choice;
		do {		
			System.out.println("please Enter number");
			int n = sc.nextInt();

			if(n>1) {
			boolean flag = true;
				for(int i =2; i<=n/2;i++) {
					if(n%i==0) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println("Prime");
				}
				else {
					System.out.println("Not Prime");
				}
				
				
			} else {
				System.out.println("Invalid number");

			}
			System.out.println("DO you wnat to print anothr Squre type yes/no");
			 choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("Thank you");
	}
}
