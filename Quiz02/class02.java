package hw.Quiz02;
import java.io.*;
public class class02 {
    public static void main(String[] args) throws IOException {
        FileWriter FW = new FileWriter("D:/Program/HW/1111/Wednesday/hw/Quiz02/rand.txt");
        BufferedWriter BW = new BufferedWriter(FW);

        for(int i = 1; i <= 1000; i++){
            BW.write(Integer.toString((int)(Math.random() * 100000)));
            BW.newLine();
        }
        BW.flush();
        FW.close();
    }
}
