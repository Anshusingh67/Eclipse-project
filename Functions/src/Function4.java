
public class Function4 {
	static int add() {
		int x=10,y=20;
		int r=x+y;
		return r;
	}
	public static void main(String[] args) {
		int s=add();
		System.out.println("Sum: "+s);
		
		System.out.println("Sum: "+add());
		
		add();//allowed
	}

}
