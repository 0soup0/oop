package ch14;

import java.io.*;;

public class class06 {
    public static void main(String[] args) {
        try{
            char data[] = new char[128];
            FileReader fr = new FileReader("D:/Program/HW/1111/Wednesday/hw/ch14/train.txt");

            int num = fr.read(data);
            String str = new String(data, 0, num);
            System.out.println("character count:" + num);
            System.out.println(str);
            fr.close();
        }
        catch(IOException e){

        }
    }
}
