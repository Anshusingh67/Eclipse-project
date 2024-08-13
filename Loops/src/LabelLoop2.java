
public class LabelLoop2 {
	
		
		
		public static void main(String[] args) {
			ram:
			for(int x=1;x<=3;x++) {
				System.out.println("Hi");
				for(int y=1;y<=4;y++) {
					System.out.println("Hello");
					if(y==2) {
						continue ram;
					}
					System.out.println("Bye");
				}
				System.out.println("Incapp");
			}
			System.out.println("INDIA");
		}
		
		
		
	}
