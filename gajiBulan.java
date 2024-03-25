import java.util.Scanner;

public class gajiBulan{
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        int jamNormal = 125;
        int upahPerjam = 10000;
        int upahLembur = 7500;
        int gaji=0;
        int lembur=0;
        int jamLembur=0;
        int gajiTotal=0;
        int ppn=0;
        int asuransi=0;
        int tunjanganIstri1=1000;
        int tunjanganKel1=1500;
        int tunjanganKel2=2500;
        int tunjanganMakan=(2500*25);
        int tunjanganPakaian=5000;
        int tunjanganTransport=5000;
        int tunjanganTelekom=6000;
        int tunjanganRumdin=10000;
        int gajiPenghasilan=0;
        int zakat=0;
        int gajiAkhir=0;

        System.out.println("");
        System.out.println("==================================================");
        System.out.println("           GAJI BULANAN PT. MVR SEJAHTERA         ");
        System.out.println("==================================================");
        System.out.println("");
        System.out.print("Masukkan Jam Kerja Anda                 : ");
        int jamKerja = input.nextInt();

        if (jamKerja > jamNormal){
            jamLembur= (jamKerja-jamNormal);
            lembur= jamLembur*upahLembur;
            asuransi= (jamNormal*upahPerjam)* 3/100;
            gaji= (jamNormal*upahPerjam) - asuransi;
            ppn =(gaji + lembur) *10/100;
            gajiTotal= (gaji + lembur) - ppn;
        }else if(jamKerja <= jamNormal){
            ppn= (upahPerjam*jamKerja) *10/100;
            asuransi=(upahPerjam*jamKerja)*3/100;
            gajiTotal= (upahPerjam*jamKerja)-ppn-asuransi;
        }else{
            System.out.println("Maaf inputan tidak valid.");
        }
        
        System.out.print("Apakah anda memiliki istri? (Y/N)       : ");
        char istri = input.next().charAt(0);

        if (istri == 'Y' || istri == 'y') {
            System.out.print("Apakah anda juga memiliki anak (Y/N)    : ");
            char anak = input.next().charAt(0);
            if (anak == 'Y' || anak == 'y') {
                System.out.print("Masukkan total anak anda                : ");
                int totalAnak = input.nextInt();
                if (totalAnak==1) {
                    gajiPenghasilan= gajiTotal+tunjanganKel1+tunjanganMakan+tunjanganPakaian+tunjanganTransport+tunjanganTelekom+tunjanganRumdin;
                }else if (totalAnak>=2){
                    gajiPenghasilan=gajiTotal+tunjanganKel2+tunjanganMakan+tunjanganPakaian+tunjanganTransport+tunjanganTelekom+tunjanganRumdin;
                }else {
                    System.out.println("Maaf inputan tidak valid.");
                }
            }else if (anak == 'N' || anak == 'n'){
                gajiPenghasilan= gajiTotal+tunjanganIstri1+tunjanganMakan+tunjanganPakaian+tunjanganTransport+tunjanganTelekom+tunjanganRumdin;
            }else {
                System.out.println("Maaf inputan tidak valid.");
            }
        }else if (istri == 'N' || istri == 'n'){
            gajiPenghasilan=gajiTotal+tunjanganMakan+tunjanganPakaian+tunjanganTransport+tunjanganTelekom+tunjanganRumdin;
        }else{
            System.out.println("Maaf inputan tidak valid.");
        }

        zakat = gajiPenghasilan* 25/1000;
        gajiAkhir = gajiPenghasilan - zakat;
        System.out.println("");
        System.out.println("-------------------MOHON TUNGGU-------------------");
        System.out.println("");
        System.out.println("Total Gaji Anda = Rp."+gajiAkhir+",-");
        System.out.println("");
        
        input.close();
    }
}