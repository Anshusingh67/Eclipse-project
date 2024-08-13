
public class Divisible_5Ans_3 {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("Enter Your Number:");
			int a = sc.nextInt();
			if(a%5==0 && a%3==0) {
				System.out.println("it is divisible by 5 and 3= "+a);
			}
			else {
				System.out.println("it is not divisible by 5 and 3 both");

			}
			System.out.println("Thank You");

			sc.close();
		}

	}

