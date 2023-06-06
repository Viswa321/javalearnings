package operators;

public class Casting {

    public static void main(String[] args) {
// Implicit casting
        int a  = 100;
        float f = .18F;
        float total = a + a*f;
        //int total = (int)( a + a*f) ;
        System.out.println(total);

//Example 2
        int a1 = 200;
       // byte b = a; ---> Invalid --Implicit casting
        byte b = (byte) a; // ---> valid -- Explicit casting // we need to mention it (byte)
        System.out.println(a1);
        System.out.println(b);
// Example 3

        byte c1 = 10;
        int c2 = c1;
        System.out.println(c2);

    }
}
