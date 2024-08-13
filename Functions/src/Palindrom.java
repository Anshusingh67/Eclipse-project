
public class Palindrom {
static boolean  palindraom(int x) {
	int num = x;
	int cmp = num ;
	int count =0;
	while(num!=0)
	{
	int rd = num%10;
	count = count*10 +rd;
	num /=10;
	}
	if(count==cmp) {


		return true;
	}else {


		return false;

	}
	}
	public static void main(String[] args) {
		int x =121;
		boolean c = palindraom(x);
		if(c) {
			System.out.println(x+" is palindrom");
		}else {
			System.out.println(x+" is not palindrom");

		}
		
	}
}

