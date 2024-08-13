
public class ClassExp1 {
public static void main(String[] args) {
	Employee a= new Employee();
	Employee b = new Employee();
	Employee c = new Employee();
	Employee d = new Employee();
	System.out.println(a);  // Alphanewmwric Adderes
	System.out.println(b);  // Alphanewmwric Adderes
	System.out.println(c);  // Alphanewmwric Adderes
	System.out.println(d);  // Alphanewmwric Adderes
	Employee e =a;
	System.out.println(a);  // Same Alphanewmwric Adderes
	System.out.println(e);  //  Same Alphanewmwric Adderes
	
	//System.out.println(name);  // Error
	System.out.println(a.name+" "+a.salary+" "+a.cname);
	System.out.println(b.name+" "+b.salary+" "+b.cname);
	System.out.println(c.name+" "+c.salary+" "+c.cname);
	System.out.println(d.name+" "+d.salary+" "+d.cname);

     a.name= "Anshu";
     a.salary = 1290000;
     a.cname ="Microsoft";
 	System.out.println(a.name+" "+a.salary+" "+a.cname); //same output
	System.out.println(e.name+" "+e.salary+" "+e.cname);// Same Output

	b.name= "Divyansh";
    b.salary = 12900000;
    b.cname ="Micro";
    
    c.name= "Ankit";
    c.salary = 13465789;
    c.cname ="Google";
    
    d.name= "Kajal";
    d.salary = 12900000;
    d.cname ="JPMorgon";
    
    
    
    System.out.println(b.name+" "+b.salary+" "+b.cname);
	System.out.println(c.name+" "+c.salary+" "+c.cname);
	System.out.println(d.name+" "+d.salary+" "+d.cname);
	
	
	int total = a.salary+b.salary+c.salary+d.salary;
    System.out.println("Total:"+ total);
    
}
}
 class Employee{
	 String name ;
	 int salary;
	 String cname;
 }