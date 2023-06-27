package Oops.constructors;
public class parametercons {
     public static void main(String[] args) {
person01 p = new person01();
         person01 p2 = new person01();
         person01 p3 = new person01();
        System.out.println(p.a);
        System.out.println(p2.a);
         System.out.println(p3.a);
         System.out.println(p3.b);
    }
}
class person01{
    int a;
    boolean b;
//default constructor
person01(){
this.a=10;
}
//parameter constructor
     person01(int b,boolean c){
   a = b;
   this.b=c;
    }
}
