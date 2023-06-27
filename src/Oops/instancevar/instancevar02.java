package Oops.instancevar;

public class instancevar02 {
    public static void main(String[] args) {
        person1 p1 = new person1();
        person1 p2 = new person1();
        System.out.println(p1.a+"\t"+p2.a);
        p1.a=25;
        System.out.println(p1.a+"\t"+p2.a);


    }
}
class person1{
    int a;

}