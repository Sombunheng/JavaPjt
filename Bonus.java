package TP03;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        int t = 3;
        while (t >= 1) {
            System.out.print("""

                    -------------Menu-------------
                    1.  Second to Time
                    2.  Time to Second
                    3.  Calling Cost
                    4.  Riels to Dollar
                    5.  Traveling Duration
                    0.  Exit
                    -------------------------------
                    Choose an option:""");
            Scanner cs = new Scanner(System.in);
            int n = cs.nextInt();
            switch (n) {
                case 0:
                    t = 0;
                    break;
                case 1:
                    ex01.main(args);
                    break;
                case 2:
                    ex02.main(args);
                    break;
                case 3:
                    ex03.main(args);
                    break;
                case 4:
                    ex04.main(args);
                    break;
                case 5:
                    ex05.main(args);
                    break;
            }
        }
    }
}