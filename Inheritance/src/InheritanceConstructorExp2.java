class M{ 
	int x=10;
	M(int a){
		System.out.println("Hi M");
		x=a;
	}
}
class N extends M{
	int y=20;
	N(){ super(7);
		System.out.println("Hi N");
	}
}
public class InheritanceConstructorExp2 {
	public static void main(String[] args) {
		N n=new N();
		System.out.println(n.x+" "+n.y);
	}
}

