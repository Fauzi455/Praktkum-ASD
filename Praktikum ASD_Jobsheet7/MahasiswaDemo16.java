import java.util.Scanner;
public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();

    System.out.print("Masukkan Jumlah Mahasiswa : ");
    int jumMhs = sc.nextInt();
    sc.nextLine();

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            System.out.println("--------------------");
            sc.nextLine();

        Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas, ipk);
        list.tambah(mhs);
    }
    list.tampil();

    System.out.println("------------------------------------");
    System.out.println("Pencarian data");
    System.out.println("------------------------------------");
    System.out.println("Masukkan IPK mahasiswa yang dicari: ");
    System.out.print("IPK: ");
    double cari = sc.nextDouble();

    System.out.println("Menggunakan Sequential Searching");
    double posisi = list.sequentialSearching(cari);
    int pss = (int)posisi;
    list.tampilPosisi(cari, pss);
    list.tampilDataSearch(cari, pss);

    System.out.println("-----------------------------------");
    System.out.println("Menggunakan Binary Search");
    System.out.println("-----------------------------------");
    double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
    int pss2 = (int)posisi2;
    list.tampilPosisi(cari, pss2);
    list.tampilDataSearch(cari, pss2);
    }  
}
