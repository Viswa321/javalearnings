package Oops.instancevar;

public class instancevar03 {
    public static void main(String[] args) {
        p0 p = null; //until you create an object it wont work
        System.out.println(p.a);
    }
}
class p0{
    int a;
}