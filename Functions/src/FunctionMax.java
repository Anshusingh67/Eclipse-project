
public class FunctionMax {
static int findMax(int a,int b) {
	if(a>b) {
		return a;
	}else {
		return b;
	}
}
public static void main(String[] args) {
	System.out.println("Max: "+findMax(12,56));
	System.out.println("Max: "+findMax(199,56));
	System.out.println("Max: "+findMax(1,56));
	System.out.println("Max: "+findMax(12,5));


}
}
