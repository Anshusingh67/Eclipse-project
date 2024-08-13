class Emplo{
	 String name ;
	 int salary;
	 String cname;
	 public void Show() {
		 System.out.println(name+" "+salary+" "+cname);;
		 
	 }
	 public void input(String n,int s,String c) {
		name = n ;
		salary = s;
		cname = c;
	 }
 }
public class ClassExp2 {
public static void main(String[] args) {
	Emplo a = new Emplo();
	Emplo b = new Emplo();
	Emplo c = new Emplo();

	
	//Show
	
	a.Show();
	b.Show();
	c.Show();
	
	//Input
	a.input("Anshu", 12030302, "Microsoft");
	b.input("kajal", 123456789, "Mi");
	c.input("ankit", 3454678, "Micron");

	a.Show();
	b.Show();
	c.Show();
	

	int total= a.salary+b.salary+c.salary;
	System.out.println("Total Salary: "+total);

	

}
}
