public class StaticMethodEx2 {
	int x=90;
	static int y=90;
	public static void main(String[] args) {
		System.out.println(y);
		System.out.println(StaticMethodEx2.y);
		//System.out.println(x);//error
		StaticMethodEx2 a=new StaticMethodEx2();
		System.out.println(a.x);
		System.out.println(a.y);

		System.out.println(new StaticMethodEx2().x);
	}
}