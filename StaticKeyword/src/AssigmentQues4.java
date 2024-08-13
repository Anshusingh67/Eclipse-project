public class AssigmentQues4 {
     static int x;
    int y;
    void m(int a) {
     y=a;
}
public static void main(String[] args) {
       System.out.println(AssigmentQues4.x);
       AssigmentQues4 a= new AssigmentQues4();
       a.m(4);
       a.x=3;
      System.out.println(a.x);
     System.out.println(a.y);
      System.out.println(a.x);
}
}

