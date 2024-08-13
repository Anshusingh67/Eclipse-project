public class ClassObjectQues12 {
int p=1;
public void m(int x) {
p=x;
}
public static void main(String[] args) {
	ClassObjectQues12 d= new ClassObjectQues12();
    d.p=3;
     System.out.println(d.p);
     d.m(4);
     System.out.println(d.p);
}
}