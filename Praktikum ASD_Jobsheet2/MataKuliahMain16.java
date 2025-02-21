public class MataKuliahMain16 {
    public static void main(String[] args) {
    
    MataKuliah16 mk1 = new MataKuliah16();
        mk1.kodeMK = "13579";
        mk1.nama = "Sistem Operasi";
        mk1.sks = 4;
        mk1.jumlahJam = 4;

        mk1.ubahSKS(3);
        mk1.tambahJam(0);
        mk1.tampilInformasi();
        System.out.println();
        
    MataKuliah16 mk2 = new MataKuliah16("09875", "Agama Islam", 6, 12);
        mk2.kurangiJam(5);
        mk2.tampilInformasi();
        
    }
}
