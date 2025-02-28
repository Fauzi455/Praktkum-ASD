public class Dosen16 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen16(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public Boolean jenisKelamin() {
        return jenisKelamin;
    }

    public int usia(){
        return usia;
    }


    public void tampilkanInfo() {
        System.out.println("Kode Dosen      : " + kode);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia            : " + usia + " tahun");
        System.out.println("--------------------------------");
    }
}