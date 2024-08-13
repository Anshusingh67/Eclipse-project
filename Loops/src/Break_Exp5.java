
public class Break_Exp5 {

		public static void main(String[] args) {
			System.out.println("Hello");
			int a=1;
			for(;a<=8;a++) {
				System.out.println("Rahul");
				if(a++==3){
					break;
				}else {
					a++;
				}
				System.out.println("Chauhan");
			}
			System.out.println("Bye");
			System.out.println(a);

		}
	}
