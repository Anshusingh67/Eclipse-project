
	class Stu{
		 private String name ;
		 private int age;
		 private String Fname;
		 private int fee;
		 private String Sname;
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
	public class ClassExp4Encpsulation {
	public static void main(String[] args) {
		Stu a = new Stu();
		Stu b = new Stu();
		Stu c = new Stu();
		Stu d = new Stu();
		Stu e = new Stu();

      // a.name="Ansj";We can not acsess the private class member directly
		//we use a public methode to access the class member
		
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
		d.input("Tan", 12, "Van",100009,"st.k");
		e.input("Davik", 3, "Ash",90003,"S.n.p");


		a.Show();
		b.Show();
		c.Show();
		d.Show();
		e.Show();
		

	}
	}
