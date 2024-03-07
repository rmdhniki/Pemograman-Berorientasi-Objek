package Tugas;

import java.util.Scanner;

public class PersegiPanjang {
    private double panjang;
    private double lebar;

    // Konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas persegi panjang
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling persegi panjang
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method untuk menampilkan nilai atribut dan hasil perhitungan
    public void tampil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Lebar: ");
        double lebar = scanner.nextDouble();

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        // Memanggil method tampil untuk menampilkan hasil
        persegiPanjang.tampil();

        scanner.close();
    }
}
