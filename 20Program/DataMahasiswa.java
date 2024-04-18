import java.util.Arrays;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int[] umurMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan umur mahasiswa ke-" + (i + 1) + ": ");
            umurMahasiswa[i] = input.nextInt();
        }

        System.out.println("\n=== Data Umur Mahasiswa ===");
        System.out.println(" ");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Umur Mahasiswa ke-: " + (i + 1) + ": " + umurMahasiswa[i]);
        }
    }
}
