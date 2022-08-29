// Challenge link: https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 2312;
        System.out.println("================================");
        for (int i = 0; i < 3; i++)
        {
            String str = input.nextLine();
            int num = input.nextInt();
            System.out.printf("%-15s%03d%n" ,str ,num);
            //(%15) 15 adet boşluk anlamına geliryor
            //(%15s) s ise string için geçerli olduğunu gösteriyor.
            //(%-15s) - ise sola yanaşık 15 boşluk (15 boşluğun içinde string değerde bulunuyor!)
            //(%d) Tam sayılar için kulanılır.
            //(%03d) 3 int değerin kaç karakter yer kapalaması gerekitini söyler.
            // 03  0 ise eğer 3 karakterli bir değerden daha değer var ise başına sıfır ekle anlamında
            // Eğer 0 yazılmamışsa ve 3 karakterden daha az ise boşluk oluşturur.
        }
        System.out.println("================================");

    }
}
