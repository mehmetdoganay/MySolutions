// Challnge link:  https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=false

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int myInt;
        double myDouble;

        myInt = input.nextInt();
        myDouble = input.nextDouble();
        String myString = input.nextLine();
        myString = input.nextLine();

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: "+ myInt);

    }
}
