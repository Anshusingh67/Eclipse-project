class A1{
     static int x;
void m() {
      x++;
      System.out.println(x);
}
static void setX(int a) {
       x=a;
}
}
public class AssigmentQues1 {
public static void main(String[] args) {
A1 a= new A1();
System.out.println(a.x);
a.m();
A1.setX(15);
a.m();
}

}
