class Employeee{
	 String name;
	 int salary;
     String cname;
	void input() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Your name:");
		 name = sc.next();
		System.out.println("Enter Your Salary");
		 salary = sc.nextInt();
		System.out.println("Enter Your compny name");
		cname = sc.next();
	}
	void show() {
		System.out.println(name + " " + salary +" "+ cname);
	}
}
public class ClassExp6 {
	public static void main(String[] args) {
		Employeee a = new Employeee();
		Employeee b = new Employeee();
		Employeee c = new Employeee();
		
		a.input();
		b.input();
		c.input();

		a.show();
		b.show();
		c.show();
		
	}

}
