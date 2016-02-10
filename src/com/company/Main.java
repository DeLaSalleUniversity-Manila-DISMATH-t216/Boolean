package com.company;

public class Main {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is " + b1);
        System.out.println("The value of b2 is " + b2);

        boolean b3 = !b1;

        System.out.println("The value of b3 is " + b3);

        System.out.println("============================");
        System.out.println("    b1  |   b2  |   b1&&b2  ");
        System.out.println("============================");
        System.out.println(" " + !b1 + " |   " +!b2 + "   |   " + (!b1 && !b2));
        System.out.println(" " + !b1 + " |   " +b2 + "   |   " + (!b1 && b2));

        /*   System.out.print("  false   |   false   |   ");
        System.out.println(!b1 && !b2);
    */

    }
}
