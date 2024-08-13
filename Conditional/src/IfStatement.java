
public class IfStatement {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("Enter Your age:");
			int age = sc.nextInt();
			if(age>=13 && age<=19) {
				System.out.println("Teenager!!");
			}
			System.out.println("Thank YouS");

			sc.close();
		}

	}

