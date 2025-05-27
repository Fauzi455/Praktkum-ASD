import java.util.Scanner;
public class TugasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

Queue queue = new Queue();
int pilih;

do{
    System.out.println();
    System.out.println("==== LAYANAN UNIT KEMAHASISWAAN ====");
    System.out.println("1. Daftar Antrian");
    System.out.println("2. Panggil Antrian");
    System.out.println("3. Tampilkan Antrian Terdepan dan Paling Akhir");
    System.out.println("4. Tampilkan Jumlah Antrian");
    System.out.println("5. Kosongkan Antrian");
    System.out.println("0. Keluar");
    System.out.print("Pilih: ");
    pilih = sc.nextInt();
    sc.nextLine();

    switch (pilih) {
        case 1:
            System.out.println();
            System.out.println("Data Mahasiswa: ");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Prodi : ");
            String prodi = sc.nextLine();
            queue.tambah(nim, nama, prodi);
            break;

        case 2: 
            queue.panggilAntrian();
            break;

        case 3:
            queue.terdepan();
            System.out.println();
            queue.terakhir();
            break;

        case 4:
            queue.jumlahAntrian();
            break;

        case 5:
            queue.clear();
            break;

        case 0:
            System.out.println("Anda telah keluar, Terima Kasih");
            break;
}
} while (pilih != 0);
}
}