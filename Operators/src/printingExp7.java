public class printingExp7 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        // Display values of a and b
        System.out.println("Values are " + a + "," + b);
        System.out.printf("Values are %d,%d\n", a, b);
        
        // Display value of a and b with a descriptive message
        System.out.println("Value of a=" + a + " and b=" + b);
        System.out.printf("Value of a=%d and b=%d\n", a, b);
        
        // Display sum of a and b
        System.out.println("Sum of " + a + " and " + b + " = " + (a + b) + ".");
        System.out.printf("Sum of %d and %d = %d.\n", a, b, (a + b));
    }
}
