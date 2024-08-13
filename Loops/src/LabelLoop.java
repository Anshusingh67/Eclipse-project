
public class LabelLoop {
		public static void main(String[] args) {
		
			rahul: 
			for(int x=1;x<=3;x++) {
				System.out.println("Hi");
				ram:
				for(int y=1;y<=4;y++) {
					System.out.println("Hello");
					if(y==2) {
						//break; //break ram;
						break rahul;
					}
					System.out.println("Bye");
				}
				System.out.println("Incapp");
			}
			System.out.println("INDIA");
		}
	}

