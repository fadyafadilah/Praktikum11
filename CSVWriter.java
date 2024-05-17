import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer 27\\Documents\\FADYA\\students.csv";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah data yang ingin ditambahkan: ");
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String[] data = new String[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.println("Masukkan data untuk mahasiswa ke-" + (i + 1) + " (format: NIM,NAMA,UMUR): ");
            data[i] = scanner.nextLine();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
