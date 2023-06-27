package Oops.constructors;

public class defaultconstruct {
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.a);
    }
}

//1.class loaders
//2.default constructor
//instance variables
class student{
    int a;

    //default constructor
student(){
    a = 10;
}
//parameter constructor
}