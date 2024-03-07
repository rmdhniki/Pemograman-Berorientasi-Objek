package Tugas;
import java.util.Scanner;
public class IndeksNilaiMatkul {
    // Method untuk menghitung indeks berdasarkan nilai
    public static String hitungIndeks(double nilai) {
        String indeks;
        
        if (nilai >= 81 && nilai <= 100) {
            indeks = "A";
        } else if (nilai >= 76 && nilai <= 80) {
            indeks = "AB";
        } else if (nilai >= 56 && nilai <= 75) {
            indeks = "B";
        } else if (nilai >= 51 && nilai <= 55) {
            indeks = "BC";
        } else if (nilai >= 41 && nilai <= 50) {
            indeks = "C";
        } else if (nilai >= 21 && nilai <= 40) {
            indeks = "D";
        } else if (nilai >= 0 && nilai <= 20) {
            indeks = "E";
        } else {
            indeks = "Nilai tidak valid";
        }
        	return indeks;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai matakuliah: ");
        double nilai = scanner.nextDouble();

        String indeks = hitungIndeks(nilai);
        System.out.println("Indeks nilai matakuliah: " + indeks);
        scanner.close();
    }
}

