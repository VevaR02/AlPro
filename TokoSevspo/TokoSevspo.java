import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


class Akun {
    private String name;
    private String email;

    public Akun setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public AdminSevspo setIdAdminSevspo(String string) {
        return null;
    }

}

class AdminSevspo extends Akun {
    private String idAdminSevspo;
    private String passAdminSevspo;

    public String getPassAdminSevspo() {
        return passAdminSevspo;
    }

    public AdminSevspo setPassAdminSevspo(String passAdminSevspo) {
        this.passAdminSevspo = passAdminSevspo;
        return this;
    }

    public AdminSevspo setIdAdminSevspo(String idAdminSevspo) {
        this.idAdminSevspo = idAdminSevspo;
        return this;
    }

    public String getIdAdminSevspo() {
        return this.idAdminSevspo;
    }

}

class Costumer extends Akun {
    private String idCostumer;
    private String passCostumer;

    public String getIdCostumer() {
        return idCostumer;
    }

    public Costumer setIdCostumer(String idCostumer) {
        this.idCostumer = idCostumer;
        return this;
    }

    public Costumer setPassCostumer(String passCostumer) {
        this.passCostumer = passCostumer;
        return this;
    }

    public String getPassCostumer() {
        return this.passCostumer;
    }
}

class Sepatu {
    private String idSepatu;
    private String namaSepatu;
    private String tipeSepatu;
    private int hargaSepatu;
    private int kuantitas;
    private boolean tersedia;

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public Sepatu setIdSepatu(String idSepatu) {
        this.idSepatu = idSepatu;
        return this;
    }

    public Sepatu setNamaSepatu(String namaSepatu) {
        this.namaSepatu = namaSepatu;
        return this;
    }

    public Sepatu setTipeSepatu(String tipeSepatu) {
        this.tipeSepatu = tipeSepatu;
        return this;
    }

    public Sepatu setHargaSepatu(int hargaSepatu) {
        this.hargaSepatu = hargaSepatu;
        return this;
    }

    public Sepatu setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
        return this;
    }

    public String getIdSepatu() {
        return idSepatu;
    }

    public String getNamaSepatu() {
        return namaSepatu;
    }

    public String getTipeSepatu() {
        return tipeSepatu;
    }

    public int getHargaSepatu() {
        return hargaSepatu;
    }

    public boolean tersedia() {
        return tersedia;
    }
}

class DetailPembelian {
    private String idDetailPembelian;
    private Pembelian pembelian;
    private Sepatu sepatu;
    private int hargaSepatu;
    private String tipeSepatu;
    private int hargaTotal;
    private int kuantitas;

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public String getIdDetailPembelian() {
        return idDetailPembelian;
    }

    public void setIdDetailPembelian(String idDetailPembelian) {
        this.idDetailPembelian = idDetailPembelian;
    }

    public Pembelian getPembelian() {
        return pembelian;
    }

    public void setPembelian(Pembelian Pembelian) {
        this.pembelian = Pembelian;
    }

    public Sepatu getSepatu() {
        return sepatu;
    }

    public void setSepatu(Sepatu Sepatu) {
        this.sepatu = Sepatu;
    }

    public int getHargaSepatu() {
        return hargaSepatu;
    }

    public void setHargaSepatu(int hargaSepatu) {
        this.hargaSepatu = hargaSepatu;
    }

    public String getTipeSepatu() {
        return tipeSepatu;
    }

    public void setTipeSepatu(String tipeSepatu) {
        this.tipeSepatu = tipeSepatu;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }

}

class Pembelian {
    private String idPembelian;
    private Costumer costumer;
    private AdminSevspo adminSevspo;
    private int total;
    private LocalDate waktu;
    private ArrayList<DetailPembelian> detailPembelianb;

    public String getIdPembelian() {
        return idPembelian;
    }

    public Pembelian setIdPembelian(String idPembelian) {
        this.idPembelian = idPembelian;
        return this;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public Pembelian setCostumer(Costumer costumer) {
        this.costumer = costumer;
        return this;
    }

    public AdminSevspo getAdminSevspo() {
        return adminSevspo;
    }

    public Pembelian setAdminSevspo(AdminSevspo adminSevspo) {
        this.adminSevspo = adminSevspo;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Pembelian setTotal(int total) {
        this.total = total;
        return this;
    }

    public LocalDate getWaktu() {
        return waktu;
    }

    public Pembelian setWaktu(LocalDate waktu) {
        this.waktu = waktu;
        return this;
    }

    public ArrayList<DetailPembelian> getDetailPembelianb() {
        return detailPembelianb;
    }

    public Pembelian setDetailPembelianb(ArrayList<DetailPembelian> detailPembelianb) {
        this.detailPembelianb = detailPembelianb;
        return this;
    }

}

class Langkah {
    HashMap<String, Sepatu> sepatub = new HashMap();
    ArrayList<Pembelian> pembelianb = new ArrayList<>();
    HashMap<String, Costumer> costumerb = new HashMap();
    HashMap<String, AdminSevspo> adminSevspob = new HashMap();

    public void setUp() {
        Sepatu sepatu1 = new Sepatu();
        Sepatu sepatu2 = new Sepatu();
        Sepatu sepatu3 = new Sepatu();
        Sepatu sepatu4 = new Sepatu();

        sepatu1.setNamaSepatu("Garuda").setIdSepatu("01").setTipeSepatu("Soccer").setHargaSepatu(299000)
                .setTersedia(true);
        sepatu2.setNamaSepatu("Maestro Leather").setIdSepatu("02").setTipeSepatu("Soccer").setHargaSepatu(599000)
                .setTersedia(true);
        sepatu3.setNamaSepatu("Imba Sala").setIdSepatu("03").setTipeSepatu("Futsal").setHargaSepatu(349000)
                .setTersedia(true);
        sepatu4.setNamaSepatu("Light Artemis").setIdSepatu("04").setTipeSepatu("Casual").setHargaSepatu(299000)
                .setTersedia(true);

        sepatub.put(sepatu1.getIdSepatu(), sepatu1);
        sepatub.put(sepatu2.getIdSepatu(), sepatu2);
        sepatub.put(sepatu3.getIdSepatu(), sepatu3);
        sepatub.put(sepatu4.getIdSepatu(), sepatu4);

        Costumer costumer1 = new Costumer();
        costumer1.setPassCostumer("veva").setIdCostumer("1237050072").setName("Muhamad Veva Ramadhan")
                .setEmail("vevaramadhan@gmail.com");

        costumerb.put(costumer1.getIdCostumer(), costumer1);

        AdminSevspo adminSevspo1 = new AdminSevspo();
        adminSevspo1.setName("Admin1").setEmail("admin@gmail.com").setIdAdminSevspo("01").setPassAdminSevspo("admin1");
        adminSevspob.put(adminSevspo1.getIdAdminSevspo(), adminSevspo1);
    }

    public void adminSevspoLogin() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            boolean loginBerhasil = false;

            do {
                System.out.print("Masukkan ID Admin\t: ");
                String idAdmin = input.readLine();
                System.out.print("Masukkan Password Admin\t: ");
                String passwordAdmin = input.readLine();
                AdminSevspo admin = adminSevspob.get(idAdmin);

                if (admin != null && admin.getPassAdminSevspo().equals(passwordAdmin)) {
                    System.out.println("Login Admin Berhasil.");
                    loginBerhasil = true;

                } else {
                    System.out.println("");
                    System.out.println("ID Admin atau password tidak sesuai, login gagal! Coba lagi.");
                }
            } while (!loginBerhasil);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CostumerLogin() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            boolean login = false;

            do {
                System.out.print("Masukkan Id\t\t: ");
                String idCostume = input.readLine();
                System.out.print("Masukkan Password\t: ");
                String passwordCostumer = input.readLine();
                Costumer costumer = costumerb.get(idCostume);

                if (costumer != null && costumer.getPassCostumer().equals(passwordCostumer)) {
                    System.out.println("Login Berhasil.");
                    login = true;

                } else {
                    System.out.println("");
                    System.out.println("ID atau password tidak sesuai, login gagal! Coba lagi.");
                }
            } while (!login);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void lihatDaftarSepatu() {
        System.out.println();
        System.out.println("=============== Daftar Sepatu ===============");
        for (Entry<String, Sepatu> Sepatu : sepatub.entrySet()) {
            String key = Sepatu.getKey();
            Sepatu tSepatu = Sepatu.getValue();
            if (tSepatu.tersedia()) {
                System.out.println("Kode Sepatu\t :" + key);
                System.out.println("Nama Sepatu\t :" + tSepatu.getNamaSepatu());
                System.out.println("Tipe Sepatu\t :" + tSepatu.getTipeSepatu());
                System.out.println("Harga Sepatu\t :" + tSepatu.getHargaSepatu());
                System.out.println("=========================================");
            }

        }
    }

    public Sepatu getSepatu(String IdSepatu) {
        return sepatub.get(IdSepatu);
    }

    public AdminSevspo getaAdminSevspo(String idAdminSevspo) {
        return adminSevspob.get(idAdminSevspo);
    }

    public Costumer getCostumer(String idCostumer) {
        return costumerb.get(idCostumer);
    }

    public void tambahSepatu() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            Sepatu Sepatu = new Sepatu();

            System.out.print("Masukkan Nama Sepatu\t: ");
            String namaSepatu = input.readLine();
            System.out.print("Masukkan ID Sepatu\t: ");
            String idSepatu = input.readLine();
            System.out.print("Masukkan Harga Sepatu\t: ");
            int hargaSepatu = Integer.parseInt(input.readLine());
            System.out.print("Apakah Sepatu tersedia? (true/false)\t: ");
            boolean tersedia = Boolean.parseBoolean(input.readLine());

            Sepatu.setNamaSepatu(namaSepatu).setIdSepatu(idSepatu).setHargaSepatu(hargaSepatu).setTersedia(tersedia);
            sepatub.put(Sepatu.getIdSepatu(), Sepatu);

            System.out.println("Sepatu berhasil ditambahkan.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hapusSepatu() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Masukkan ID Sepatu yang akan dihapus\t: ");
            String idSepatu = input.readLine();

            Sepatu Sepatu = sepatub.remove(idSepatu);

            if (Sepatu != null) {
                System.out.println("Sepatu dengan ID " + idSepatu + " berhasil dihapus.");
            } else {
                System.out.println("Sepatu dengan ID " + idSepatu + " tidak ditemukan.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pembelian() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetailPembelian> tDetailPembelianb = new ArrayList<>();
        int increment = 0;
        String lanjut = "";
        try {
            do {
                increment++;
                System.out.println();
                System.out.print("Silahkan masukkan kode Sepatu\t: ");
                String kodeSepatu = input.readLine();
                System.out.print("Banyak beli\t\t\t: ");
                int jumlah = Integer.valueOf(input.readLine());
                System.out.print("Beli sepatu lainnya (Y/N)?\t: ");
                lanjut = input.readLine();

                DetailPembelian dp = new DetailPembelian();
                Sepatu tSepatu = getSepatu(kodeSepatu);
                dp.setIdDetailPembelian("dp" + increment);
                dp.setSepatu(tSepatu);
                dp.setHargaSepatu(tSepatu.getHargaSepatu());
                dp.setKuantitas(jumlah);
                dp.setHargaTotal(tSepatu.getHargaSepatu() * jumlah);
                tDetailPembelianb.add(dp);

            } while (lanjut.equalsIgnoreCase("Y"));

            System.out.println("");
            System.out.println("=== Berikut Daftar Pembelian Sepatu Anda ===");
            tampilkanDaftarPembelian(tDetailPembelianb);
            System.out.println("Total Harga: " + hitungHargaTotal(tDetailPembelianb));
            BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Konfirmasi Pembelian (Y/N)?");
            String konfirm = "n";
            konfirm = inputKonfirmasi.readLine();
            if (konfirm.equalsIgnoreCase("y")) {
                Pembelian Pembelian = new Pembelian();
                Pembelian.setDetailPembelianb(tDetailPembelianb)
                        .setIdPembelian("Pembelian" + pembelianb.size() + 1)
                        .setAdminSevspo(getaAdminSevspo("01"))
                        .setCostumer(getCostumer("1237050072"))
                        .setWaktu(LocalDate.now())
                        .setTotal(hitungHargaTotal(tDetailPembelianb));
                pembelianb.add(Pembelian);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampilkanDaftarPembelian(ArrayList<DetailPembelian> dp) {
        for (DetailPembelian detailPembelian : dp) {
            System.out.println("Nama Sepatu \t :" + detailPembelian.getSepatu().getNamaSepatu());
            System.out.println("Tipe Sepatu \t :" + detailPembelian.getSepatu().getTipeSepatu());
            System.out.println("Harga Sepatu \t :" + detailPembelian.getHargaSepatu());
            System.out.println("");
        }
    }

    public int hitungHargaTotal(ArrayList<DetailPembelian> dp) {
        int total = 0;
        for (DetailPembelian detailPembelian : dp) {
            total += detailPembelian.getHargaTotal();
        }
        return total;
    }

    public void tampilkanLaporanPembelian() {
        for (Pembelian pembelian : pembelianb) {
            System.err.println();
            System.out.println("========================== Laporan ==========================");
            System.out.println("Kode Pembelian \t : " + pembelian.getIdPembelian());
            System.out.println("Tanggal Pembelian \t : " + pembelian.getWaktu());
            System.out.println("Admin \t\t\t : " + pembelian.getAdminSevspo().getName());
            System.out.println("Costumer \t\t : " + pembelian.getCostumer().getName());
            System.out.println("==========================================================");
            ArrayList<DetailPembelian> detailPembelianb = pembelian.getDetailPembelianb();
            for (DetailPembelian dp : detailPembelianb) {
                System.out.println("Nama Sepatu \t\t : " + dp.getSepatu().getNamaSepatu());
                System.out.println("Tipe Sepatu \t\t : " + dp.getSepatu().getTipeSepatu());
                System.out.println("Harga Sepatu \t\t : " + dp.getHargaTotal());
                System.out.println("==========================================================");
            }
            System.out.println("==========================================================");
        }
    }

    public void tampilkanMenuAdmin() {
        System.out.println("");
        System.out.println("=============== Menu Admin ===============");
        System.out.println("1. Lihat Daftar Sepatu");
        System.out.println("2. Menambah Sepatu ke Daftar");
        System.out.println("3. Menghapus Sepatu dari Daftar");
        System.out.println("4. Laporan Pembelian Sepatu");
        System.out.println("5. Keluar");
    }

    public void tampilkanMenuCostumer() {
        System.out.println("");
        System.out.println("=============== Menu SevsBro ===============");
        System.out.println("1. Lihat Daftar Sepatu");
        System.out.println("2. Membeli Sepatu");
        System.out.println("3. Laporan Pembelian Sepatu");
        System.out.println("4. Keluar");
    }

}

public class TokoSevspo {

    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            Langkah library = new Langkah();
            library.setUp();
            boolean keluar = false;
            do {
                System.out.println("");
                System.out.println("=============== Sevspo Official ===============");
                System.out.print("Pilih Peran Sevspo Clan Anda, \n1. Admin 2. Costumer 3. Batal: ");
                String peran = input.next();
                switch (peran) {
                    case "1":
                        System.out.println("Jika anda adalah admin, masukkan akun admin anda!");
                        library.adminSevspoLogin();

                        boolean lanjut = true;
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        while (lanjut) {
                            library.tampilkanMenuAdmin();
                            System.out.print("Pilih menu : ");
                            String pilihan = reader.readLine();
                            switch (pilihan) {
                                case "1":
                                    library.lihatDaftarSepatu();
                                    break;
                                case "2":
                                    library.tambahSepatu();
                                    break;
                                case "3":
                                    library.hapusSepatu();
                                    break;
                                case "4":
                                    library.tampilkanLaporanPembelian();
                                    break;
                                case "5":
                                    lanjut = false;
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                                    break;
                            }
                        }

                        System.out.println("Sampai jumpa lagi Admin!");
                        break;
                    case "2":
                        System.out.println("Jika anda costumer, masukkan akun anda!");
                        library.CostumerLogin();
                        boolean notLanjut = false;
                        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
                        while (!notLanjut) {
                            library.tampilkanMenuCostumer();
                            System.out.print("Pilih menu : ");
                            String pilihan = baca.readLine();
                            switch (pilihan) {
                                case "1":
                                    library.lihatDaftarSepatu();
                                    break;
                                case "2":
                                    library.pembelian();
                                    break;
                                case "3":
                                    library.tampilkanLaporanPembelian();
                                    break;
                                case "4":
                                    notLanjut = true;
                                    break;
                                default:
                                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                                    break;
                            }
                        }

                        System.out.println("Sampai jumpa lagi SevsBro!");
                        break;

                    case "3":
                        keluar = true;
                        break;
                    default:
                        System.out.println("Pilihan Tidak Valid.");
                        break;
                }
            } while (!keluar);
        }
    }

}
