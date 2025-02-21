public class DosenMain16 {
    public static void main(String[] args) {
      
Dosen16 dosen1 = new Dosen16();
    dosen1.idDosen = "1234";
    dosen1.nama = "Pak Fauzi";
    dosen1.statusAktif = true;
    dosen1.tahunBergabung = 2020;
    dosen1.bidangKeahlian = "Komunikasi Visual";

    dosen1.ubahKeahlian("Pemrograman");
    dosen1.tampilInformasi();
    System.out.println();

Dosen16 dosen2 = new Dosen16("6789", "Pak Rohman", true, 2019, "Matematika Lanjut");
    dosen2.setStatusAktif(false);
    dosen2.tampilInformasi();
    int masaKerja = dosen2.hitungMasaKerja(2025);
    System.out.println("Masa kerja dosen adalah " + masaKerja + " tahun");
    System.out.println();
    }
    
}
