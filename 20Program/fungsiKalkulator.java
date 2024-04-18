import java.util.Scanner;

public class fungsiKalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan x: ");
        int x = input.nextInt();

        System.out.print("Masukkan y: ");
        int y = input.nextInt();

        System.out.println("x + y = " + penjumlahan(x, y));
        System.out.println("x - y = " + pengurangan(x, y));
        System.out.println("x * y = " + perkalian(x, y));
        System.out.println("x / y = " + pembagian(x, y));

    }


    static int penjumlahan(int x, int y) {

        return x + y;

    }

    static int pengurangan(int x, int y) {

        return x - y;

    }

    static int perkalian(int x, int y) {

        return x * y;

    }

    static double pembagian(double x, double y) {

        return x / y;

    }

}