
public class Main {
    public static void main(String[] args) {

        String nama = "Muhamad Veva Ramadhan";
        int nim = 1237050072;
        byte tgs = 90;
        byte uts = 90;
        byte uas = 90;
        System.out.println("DATA MAHASISWA");
        System.out.println("NAMA : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai Tugas : " + tgs);
        System.out.println("Nilai UTS : " + uts);
        System.out.println("Nilai UAS : " + uas);
        System.out.println("Nilai Akhir :" + (tgs*30/100 + uts*30/100 + uas*40/100));

    }
}