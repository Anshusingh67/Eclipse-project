
public class ForLoopExp2 {
		public static void main(String[] args) {
			for(int a=1;a<=5;) {
				System.out.println("Rahul Chauhan");
				a++;
			}
			System.out.println("--------------");
			int a=1;
			for(;a<=5;) {
				System.out.println("Rahul Chauhan");
				a++;
			}
			System.out.println("--------------");
			for(;;) {    //Infinite Loop  by default condition true
				System.out.println("Rahul Chauhan");
			}
			//System.out.println("bye");//error
		}
}
