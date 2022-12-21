package hw.Quiz02;
import java.util.*;
public class class01 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("密碼輸入測試");
            System.out.print("請輸入密碼:");
            int num = sc.nextInt();
            int a = 0;
            while(true){
                System.out.print("請再輸入一次密碼:");
                int newnum = sc.nextInt();
                if(num == newnum)
                    break;
                else
                    a++;
                if(a == 3)
                    throw new RuntimeException("輸入三次錯誤！程式停止！");
                else
                    System.out.println("與第一次輸入的不同!");
            }
            System.out.println("密碼正確");
        }
    }
}
