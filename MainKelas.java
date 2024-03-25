import java.util.Scanner;

public class MainKelas{
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka yang akan dicek: ");
        int angka = input.nextInt();

        
        // Contoh 1 : if-else untuk mengecek apakah sebuah angka positif atau negatif
        if(angka>=0){
            System.out.println("Angka "+angka+" adalah positif.");
        }else {
            System.out.println("Angka "+angka+" adalah negatif.");
        }

        // Contoh 2 : if-else untuk mengecek apakah sebuah angka ganjil atau genap
        if (angka % 2 == 0) {
            System.out.println("Angka "+angka+" adalah genap.");
        }else{
            System.out.println("Angka "+angka+" adalah ganjil.");
        }

        // Contoh 3 : if-else bersarang (nested if-else) untuk mengecek kategori umur
        System.out.print("Masukkan Umur Anda: ");
        int umur = input.nextInt();

        if (umur<0){
            System.out.println("Umur tidak valid.");
        } else if(umur>=0 && umur<=5) {
            System.out.println("Anda adalah seorang balita.");
        } else if (umur<5 && umur>12){
            System.out.println("Anda adalah seorang anak-anak.");
        } else if (umur>=12 && umur<20){
            System.out.println("Anda adalah seorang remaja.");
        } else if (umur>=20 && umur<60){
            System.out.println("Anda adalah seorang dewasa.");
        } else if(umur >= 60 && umur<=100) {
            System.out.println("Anda adalah seorang manula.");
        } else {
            System.out.println("Anda adalah seorang buyut.");
        }

        /*Tugas : Buat program untuk penggajian.
        125 jam perbulan
        perjam 10000
        lembur 7500
        ppn 10%
        total gaji 
        tunjangan istri tanpa anak 1000
        anak 1 dan istri 1500
        anak 2 dan istri 2000
        tunjangan makan perhari 2500
        tunjangan pakaian 5000 perbulan
        tunjangan transport 5000 perbulan
        tunjangan telekomunikasi 6000 perbulan
        tunjangan rumah dinas 10000 perbulan
        asuransi 3%
        zakat 2,5 dari pendapatan*/ 
    }
}