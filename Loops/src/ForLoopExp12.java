
public class ForLoopExp12 {
		public static void main(String[] args) {
			byte a=1;                        // by default it is true
//			for(;;) {
//				System.out.println(a++);
//		}
			System.out.println(a+127); //128
			System.out.println((byte)(a+127)); //-128
			a=127;
			System.out.println(++a); //-128
		}
	}

