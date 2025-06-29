public class Mahasiswa16 {

    public String nim;
    public String nama;
    public String kelas;
    public double ipk;

public Mahasiswa16(){
}

public Mahasiswa16(String nim, String nama, String kelas, double ipk){
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
}

public void tampilInformasi(){
    System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
}
}
