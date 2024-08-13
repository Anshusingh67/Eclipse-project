class DAA{
    static int x;
    static void m() {
    x++;
}
static void show() {
     System.out.println(x);
}
}
public class AssigmentQues3 {
public static void main(String[] args) {
        System.out.println(DAA.x);
        DAA.m();
        DAA.m();
        DAA.show();
}
}

