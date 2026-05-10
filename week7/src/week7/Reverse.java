package week7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reverse {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("input.txt"));
            String[] lines = new String[1000];
            int count = 0;
            String data;
            while ((data = br.readLine()) != null) {
                lines[count] = data;
                count++;
            }
            bw = new BufferedWriter(new FileWriter("output.txt"));
            for (int i = count - 1; i >= 0; i--) {
                bw.write(lines[i]);
                bw.newLine();
            }
            bw.flush();
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("File Error");
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                System.out.println("Close Error");
            }
        }
    }
}