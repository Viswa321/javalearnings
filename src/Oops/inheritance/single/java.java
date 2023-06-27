package Oops.inheritance.single;

public class java extends program{

    //extends is a kew word to get all the
    //sub class or child class

    java(){
        System.out.println("i am default constructor");
    }
    java(int version , String author){
//to call parent and child we use "SUPER" key word  calling the parametrize  and default constructor of parent class
super(version,author);

    }

    public void printDetails(){

        super.printInfo();

    }
}

