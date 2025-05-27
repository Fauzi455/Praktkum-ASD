public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

Mahasiswa(String nim, String nama, String prodi){
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
}

public void tampil(){
    System.out.println(nama + "\t" + nim + "\t" + prodi);
}
}
