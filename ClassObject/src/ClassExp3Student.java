class Student{
	 String name ;
	 int age;
	 String Fname;
	 int fee;
	 String Sname;
	 public void Show() {
		 System.out.println(name+" "+age+" "+Fname+" "+fee+" "+ Sname);
		 
	 }
	 public void input(String n,int s,String c ,int f,String sc) {
		name = n ;
		age = s;
		Fname = c;
		fee = f;
		Sname = sc;
	 }
 }
public class ClassExp3Student {
public static void main(String[] args) {
	Student a = new Student();
	Student b = new Student();
	Student c = new Student();
	Student d = new Student();
	Student e = new Student();


	
	//Show
	
	a.Show();
	b.Show();
	c.Show();
	d.Show();
	e.Show();

	
	//Input
	a.input("Anshu", 22, "Deeepak",200000,"Abic");
	b.input("Tanve", 12, "Vandna",10000,"st.k");
	c.input("Davik", 3, "Ashish",9000,"S.n.p");
	d.input("Tan", 12, "Van",100009,"s///t.k");
	e.input("Davik", 3, "Ash",90003,"S.///n.p");


	a.Show();
	b.Show();
	c.Show();
	d.Show();
	e.Show();

	

}
}
