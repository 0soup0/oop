package ch14;

import java.io.*;
import java.util.Arrays;

public class class10 {
    public static void main(String[] args) throws IOException{
        FileWriter fw1 = new FileWriter("D:/Program/HW/1111/Wednesday/hw/ch14/rand1.txt");
        FileWriter fw2 = new FileWriter("D:/Program/HW/1111/Wednesday/hw/ch14/rand2.txt");
        FileReader fr = new FileReader("D:/Program/HW/1111/Wednesday/hw/ch14/rand1.txt");

        BufferedWriter bw1 = new BufferedWriter(fw1);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        BufferedReader br = new BufferedReader(fr);

        String str;
        int arr[] = new int[1000];

        for(int i = 1; i <= 1000; i++){
            bw1.write(Integer.toString((int)(Math.random() * 100000)));
            bw1.newLine();
        }
        bw1.flush();
        fw1.close();

        int max = 0, min = 100000, sum = 0, i = 0;
        while((str = br.readLine()) != null){
            arr[i] = Integer.parseInt(str);
            sum += arr[i];
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
            i++;
        }
        System.out.printf("Maximum = %d, Minimum = %d\n", max, min);
        System.out.printf("Average = %d\n", sum / 1000);

        Arrays.sort(arr);
        for(i = 0; i < 1000; i++){
            bw2.write(Integer.toString(arr[i]));
            bw2.newLine();
        }
        bw2.flush();
        fw2.close();
    }
}
