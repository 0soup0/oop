package ch14;

import java.io.*;

public class class07 {
    public static void main(String[] args) throws IOException{
        int cnt = 0;
        String str;
        FileReader fr = new FileReader("D:/Program/HW/1111/Wednesday/hw/ch14/donkey.txt");
        BufferedReader bf = new BufferedReader(fr);
        
        while((str = bf.readLine()) != null){
            if(cnt == 1)
                bf.skip(14);
            System.out.println(str);
            cnt++;
        }
        fr.close();
    }
}
