package Tugas;
import java.util.Scanner;
public class Totalbilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan (N): ");
        int N = scanner.nextInt();

        // Mengecek jika N tidak boleh nol atau minus
        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
            System.out.println("total = 0");
        } else {
            int total = 0;

            // Meminta pengguna memasukkan N bilangan
            System.out.println("Masukkan " + N + " bilangan:");
            for (int i = 0; i < N; i++) {
                int bilangan = scanner.nextInt();
                total += bilangan;
            }

            System.out.println("total = " + total);
        }
        scanner.close();
    }
}
