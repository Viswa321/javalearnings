package operators;

public class Test03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);

      String name1 = "viswa";
      String name2 = "10";
       System.out.println(a+name1);
        System.out.println(name2+a);
        System.out.println(name1+10+5);
        System.out.println(10+5+name1);

        //Behave --> Left to right -->first is int -- sum , first is string --> concatenate

    }


}
