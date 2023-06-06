package operators;

public class Test02 {
    public static void main(String[] args) {
        int b = 10;
        //Post decrement b--;
        //Pre decrement --b;
        System.out.println(--b + b++);
        //--b --> Exp value = 9 , b = 9
        //b++ --> Exp value = 9 , b = 10
        // out put will print EXP value 9+9 = 18
        System.out.println(b);

        float t = 10/3f;
        System.out.println(t);



    }
}
