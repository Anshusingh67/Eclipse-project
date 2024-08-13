
public class ForLoopExp9 {
public static void main(String[] args) {
	System.out.println("Hello");
	
	for(int i =1;i<=5;i++) {
		System.out.println(i++ +"Hi");
	}
	System.out.println("====================");
	int i =1;
	for(;i++<=7;i++) {
		System.out.println(i++ +" Hi");  
	}
	System.out.println(i +" Bye");
	System.out.println("====================");
	
	int x;
	for(x=1;++x<=12;++x) {
		System.out.println("Hello"+x++ + ++x);
	}
	
	System.out.println("Bye"+x);


}
}
