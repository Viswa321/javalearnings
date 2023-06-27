package Oops;

public class test01 {
    public static void main(String[] args) {
    person p1 = new person();
    p1.name = "Viswa";
    p1.age = 27;
    p1.gender = "Male";
    p1.height = 5.10;
    p1.address ="AP";

    p1.run();
    p1.walk();
    p1.sleep();


    }
}
class person{
//Attributes
//Instance variables
    String name;
    int age;
    String gender;
    double height;
    int MobileNo;
    String address;

    //Methods
    //instance methods
    void run(){
    }
    void walk(){
}
    void sleep(){
    }
    //static method , attributes , inner classes
}

