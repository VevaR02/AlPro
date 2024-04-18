import java.util.Arrays;
import java.util.Scanner;

public class dataSepatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah tipe sepatu: ");
        int jumlahTipesepatu = input.nextInt();

        String[] tipeSepatu = new String[jumlahTipesepatu];
        int[] quantityPertipe = new int[jumlahTipesepatu];
        int[] hargaSepatu = new int[jumlahTipesepatu];

        for (int i = 0; i < jumlahTipesepatu; i++) {

            System.out.println("=====Data ke-" + (i + 1) + "=====");
            System.out.print("Masukkan sepatu tipe ke-" + (i + 1) + ": ");
            tipeSepatu[i] = input.next();

            System.out.print("Masukkan stok sepatu tipe ke-" + (i + 1) + ": ");
            quantityPertipe[i] = input.nextInt();

            System.out.print("Masukkan harga sepatu tipe ke-" + (i + 1) + ": ");
            hargaSepatu[i] = input.nextInt();
        }

        System.out.println("\n=== Data Sepatu ===");
        for (int i = 0; i < jumlahTipesepatu; i++) {
            System.out.println("Tipe: " + tipeSepatu[i]);
            System.out.println("Stok: " + quantityPertipe[i]);
            System.out.println("Harga: " + hargaSepatu[i]);
            System.out.println("======================");
        }

    }
}