// challenge address = https://www.hackerrank.com/challenges/java-if-else/problem
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(!(n % 2 == 0)){
            System.out.print("Weird");
        }else {
            if (n >= 2 && n <= 5) {
                System.out.print("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.print("Weird");
            } else {
                System.out.print("Not Weird");
            }
        }
    }
}
