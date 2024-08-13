class Emp{
	String name;
	int Salary;
	static String Cname ="Abc";
	void show() {
		System.out.println(name+" "+ Salary+" "+Cname);
	}
	void input(String n, int s ) {
		 name = n;
		 Salary = s;
		
	}
	
	static void display() {
		System.out.println("Hi Employee");
		//System.out.println(name);//error
		//System.out.println(salary);//error
		System.out.println(Cname);
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		Emp.display();
		
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();

		a.input("Yoyo Gupta", 78000);
		b.input("Teja Khan", 90000 );
		c.input("Kaliya", 6300);
		d.input("Rajnikant", 10000000);
		
		Emp.display();
		d.display();
		a.Cname = "xyz";
		
		a.show();
		b.show();
		c.show();
		d.show();
		
		Emp.display();

	}

}
