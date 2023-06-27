package Oops.inheritance.single;

public class program {
//Base class
    //default constructor
    //same name and not argument
    //no return type

    int version;
    String author;

    //default constructor
    program(){
        System.out.println("I am default constructor");
    }
    //parameterize constructor
program(int version,String author){
//this
    this.author = author;
    this.version = version;
}


    public void printInfo() {
        System.out.println("program{" +
                "version=" + version +
                ", author='" + author + '\'' +
                '}');
    }
}
