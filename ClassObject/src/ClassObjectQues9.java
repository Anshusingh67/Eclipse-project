class AQ{
int x=10;
String y="Rahul";
void show() {
System.out.println(x+y);
}
}
public class ClassObjectQues9 {
public static void main(String[] args) {
   AQ a= new AQ();
   AQ b= new AQ();
   a.x=15;
   a.show();
   a.y="YoYo";
   a.show();
   b.show();
   b.y="Ramu";
   a.show();
   b.show();
}
}
