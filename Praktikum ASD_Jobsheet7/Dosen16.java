public class Dosen16 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen16(){

    }

    Dosen16(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    public void tampil() {
        System.out.println("Kode Dosen   : " + kode);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia         : " + usia + " tahun");
    }

    int getUsia() {
    return usia;
    }
}