class Animal{
	String name;
	int age;
	void show() {
		System.out.println(name+age);
	}
	Animal(){
		name="Dog";
		age=10;
		System.out.println("Hello Animal");
	}
}
public class ConstuctorExp1 {
	public static void main(String[] args) {
		Animal a1=new Animal();
		//a1.Animal();//error
		Animal a2=new Animal();
		Animal a3=new Animal();
		//Animal a4=new Animal("Cat",8);//error
		a1.show();
		a2.show();
		a3.show();
	}

}

