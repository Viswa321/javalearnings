package Loops;

import java.util.Scanner;

public class Switchdemobrowser {
    public static void main(String[] args) {
        System.out.println("Enter our browser");
        Scanner sc = new Scanner(System.in);
        String browser;
        browser = sc.next();
        browser = browser.toLowerCase();


        switch (browser) {
            case "chrome":
                System.out.println("Chrome started");
                break;

            case "firefox":
                System.out.println("Firefox started");
                break;
            case "edge":
                System.out.println("edge started");
                break;
            default:
                System.out.println("default started");
                break;

        }
        System.out.println("END");

    }
}
