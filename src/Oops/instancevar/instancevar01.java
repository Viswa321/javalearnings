package Oops.instancevar;

public class instancevar01 {
    public static void main(String[] args) {
        person p1 = new person(); //instance variable cant access without reference
        System.out.println(p1.a);
        System.out.println(p1.b);
        p1.a = 99;
        System.out.println(p1.a);
    }

}

class person{
int a;
boolean b;
}