
public class FunctionReturn {
static void add(int x,int y) {
	int z= x+y;
	if(x>100) {
		return;    // break ki tarh kam krta hai
	}
	System.out.println("Sum:"+z);
}
public static void main(String[] args) {
	add(12,28);
	add(108,28);
	add(12,28);


}
}
