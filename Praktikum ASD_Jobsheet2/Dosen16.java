public class Dosen16 {
    String idDosen;
    String nama;
    boolean statusAktif = true;
    int tahunBergabung;
    String bidangKeahlian;

public Dosen16(){
}
    public Dosen16(String id, String nm, boolean statusAktf, int tahun, String keahlian){
        idDosen = id;
        nama = nm;
        statusAktif = statusAktf;
        tahunBergabung = tahun;
        bidangKeahlian = keahlian;
    }

    
    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        statusAktif=status;
    }
        public boolean aktif(){
        return statusAktif;
        }

    int hitungMasaKerja(int thnSkrg){
        return thnSkrg-=tahunBergabung;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
