
public class PrintingExp6 {

	public static void main(String[] args) {
		int a=10,b=5;
		    System.out.println(a+"h");          //10h
	        System.out.println(a+'h');          //114
	        System.out.println(a+"hi");         //10hi
			System.out.println(a+"hi"+b);       //10hi5
			System.out.println(4+a+"hi"+b);     //14hi5
			System.out.println(4+a+"hi"+b+2);   //14hi52
			System.out.println(4+a+"hi"+(b+2)); //14hi7
			System.out.println(a+'a'+"hi"+'a'); //107hia
			System.out.println(a-'a'+"hi"+'a'+a); //-87hia10
			//System.out.println(a-4+"hi"+a-4);//error
			System.out.println(a-4+"hi"+(a-4));  //6hi6
			System.out.println(a*4+"hi"+a*4);    //40hi40
	}
}
