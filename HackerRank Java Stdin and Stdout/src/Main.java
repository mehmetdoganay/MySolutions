// challenge link : https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=false

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        for (int i = 0; i < 3; i++)
        {
            int num = input.nextInt();
            System.out.println(num);
        }

    }
}
