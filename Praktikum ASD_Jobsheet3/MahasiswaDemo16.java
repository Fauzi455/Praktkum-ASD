public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Mahasiswa16[] arrayOfMahasiswa16 = new Mahasiswa16[3];
        arrayOfMahasiswa16[0] = new Mahasiswa16();
        arrayOfMahasiswa16[0].nim = "244107060033";
        arrayOfMahasiswa16[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa16[0].kelas = "SIB-1E";
        arrayOfMahasiswa16[0].ipk = (float) 3.75;

        arrayOfMahasiswa16[1] = new Mahasiswa16();
        arrayOfMahasiswa16[1].nim = "2341720172";
        arrayOfMahasiswa16[1].nama = "AHMAD MAULANA HAMZAH";
        arrayOfMahasiswa16[1].kelas = "TI-2A";
        arrayOfMahasiswa16[1].ipk = (float) 3.36;

        arrayOfMahasiswa16[2] = new Mahasiswa16();
        arrayOfMahasiswa16[2].nim = "244107023006";
        arrayOfMahasiswa16[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa16[2].kelas = "TI-2E";
        arrayOfMahasiswa16[2].ipk = (float) 3.80;


        System.out.println("NIM     : " + arrayOfMahasiswa16[0].nim);
        System.out.println("Nama    : " +arrayOfMahasiswa16[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa16[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa16[0].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa16[1].nim);
        System.out.println("Nama    : " +arrayOfMahasiswa16[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa16[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa16[1].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa16[2].nim);
        System.out.println("Nama    : " +arrayOfMahasiswa16[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa16[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa16[2].ipk);
        System.out.println("--------------------------------------");
    }
    
}
