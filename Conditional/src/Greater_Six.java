
public class Greater_Six {
		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("Enter Your number:");
			int num1 = sc.nextInt();
			
			System.out.println("Enter Your number:");
			int num2 = sc.nextInt();
			
			System.out.println("Enter Your number:");
			int num3 = sc.nextInt();
			
			System.out.println("Enter Your number:");
			int num4 = sc.nextInt();
			
			System.out.println("Enter Your number:");
			int num5 = sc.nextInt();
			
			System.out.println("Enter Your number:");
			int num6 = sc.nextInt();
			if(num1==num2 && num1==num3 && num1==num4  && num1==num5 && num1==num6)
				{
			System.out.println("All are equal");
				}
			else if(num1>=num2 && num1>=num3 && num1>=num4  && num1>=num5 && num1>=num6	)
			{
				System.out.println("it is greater "+num1);
	
			}
			
			else if(num2>=num1 && num2>=num3 && num2>=num4  && num2>=num5 && num2>=num6	)
			{
				System.out.println("it is greater "+num2);
	
			}
			else if(num3>=num2 && num3>=num1 && num3>=num4  && num3>=num5 && num3>=num6	)
			{
				System.out.println("it is greater "+num3);
	
			}
			else if(num4>=num2 && num4>=num3 && num4>=num1  && num4>=num5 && num5>=num6	)
			{
				System.out.println("it is greater "+num4);
	
			}
			else if(num5>=num2 && num5>=num3 && num5>=num4  && num5>=num1 && num5>=num6	)
			{
				System.out.println("it is greater "+num5);
	
			}else {
				System.out.println("it is greater "+num6);

			}
			System.out.println("Thank You");
			sc.close();
			
		}

	}

