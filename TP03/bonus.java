package TP03 ;

import java.util.Scanner;

public class bonus{

public static void main(String[] args) {
    int d = 7, v = 30;
    double sec1 = d * 3600;
    System.out.print("Please input traffic jam factor ( in percentage [1-100] ):");
    Scanner cs = new Scanner(System.in);
    int n = cs.nextInt();
    if (n >= 100) {
        System.out.println("Your car not moving !");
    } else {
        double result1;
        result1 = (1 - (n * 0.01)) * 30;
        double x = sec1 / result1;
        int result;
        result = (int) x;
        int hour;
        hour = result / 3600;
        int minute;
        minute = (result % 3600) / 60;
        int sec;
        sec = (result % 3600) % 60;
        System.out.printf("Traveling Duration = %02d:%02d:%02d", hour, minute, sec);
        System.out.println(); 
}
}
}