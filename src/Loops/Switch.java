package Loops;

public class Switch {
    public static void main(String[] args) {
        int a = 45;
            final int x = 30;
            switch (a){
                case 10:
                    System.out.println("Cas10 matches");
                    break;// in swith we need to use break
                case 20:
                    System.out.println("Cas20 matches");
                    break;
                case 30:
                    System.out.println("Case30 matches");
                    break;
                case 10+20+15:
                    System.out.println("case pass");
                //case 30:
                   // System.out.println("case pass2");
                default:
                    System.out.println("Default");

            }
        System.out.println();
    }
}
