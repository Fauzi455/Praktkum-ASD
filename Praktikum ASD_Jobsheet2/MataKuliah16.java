public class MataKuliah16 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
        
public MataKuliah16(){
}
        
    public MataKuliah16(String kode, String nm, int sks, int jmlJam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;  
    }
    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam > jam) {
            jumlahJam -= jam;
        } else{
        System.out.println("Pengurangan jam tidak bisa dilakukan");
        }
    }
}

