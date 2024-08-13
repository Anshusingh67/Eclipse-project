class Animal{
	String name;
	int age;
	static String color;
	void show() {
		System.out.println(name+" "+age+" "+color);
	}
	void input(String n,int a) {
		name =n;
		age = a;
	}
	static void display() {
		System.out.println(color);
	}
	static {
		color ="Green";
		System.out.println("Hello Animal");
		System.out.println(color);
	}
}
public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("Hello main");
	    Animal.color ="red";
	    Animal a = new Animal();
	    Animal b = new Animal();
	    Animal c = new Animal();
        a.input("Dog", 4);
       b.input("Cat", 8);
        c.input("Tiger", 9);
        
        
        a.show();
        b.show();
        c.show();
     
        
        Animal.display();
        a.display();
	
	}

}
