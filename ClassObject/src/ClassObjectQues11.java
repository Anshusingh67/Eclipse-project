class ClassObjectQues11 {
private int x;
public void show() {
x++;
System.out.println(x);
}
public static void main(String[] args) {
	ClassObjectQues11 a= new ClassObjectQues11();
    a.show();
    ClassObjectQues11 b= new ClassObjectQues11();
    a.show();
    b.show();
}
}

