class st{
	private String name;
	private int age;
	private String cname;
	public void show(){
		System.out.println(name+" "+age+" "+cname);
	}
	void input() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Student Details:");
		System.out.println("Name: ");
		name=sc.next();
		System.out.println("Age: ");
		age=sc.nextInt();
		System.out.println("School name: ");
		cname=sc.next();
	}
}

public class ClassExp7 {
	public static void main(String[] args) {
		st a=new st();
		st b=new st();
		st c=new st();
		st d=new st();
		
		a.input();
		b.input();
		c.input();
		d.input();

	
		a.show();
		b.show();
		c.show();
		d.show();
		
	}
}