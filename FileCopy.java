package CSVReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\komputer 27\\Documents\\FADYA\\asal.csv";
        String destinationFile = "C:\\Users\\komputer 27\\Documents\\FADYA\\tujuan.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
