package ch14;

import java.util.Scanner;
import java.lang.String;

public class class02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("輸入字串:");
            String str = sc.nextLine();
            System.out.println("轉換成大寫:" + str.toUpperCase());
        }
    }
}
