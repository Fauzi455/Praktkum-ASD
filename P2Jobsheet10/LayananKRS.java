import java.util.Scanner;
public class LayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

AntrianKRS antrian = new AntrianKRS(5);
int pilihan;

do {
    System.out.println("\n=== Menu Antrian Kartu Rencana Studi ===");
    System.out.println("1. Tambah Mahasiswa ke Antrian KRS.");
    System.out.println("2. Memproses KRS.");
    System.out.println("3. Tampilkan Semua Antrian KRS.");
    System.out.println("4. Tampilkan 2 Antrian Terdepan.");
    System.out.println("5. Tampilkan Antrian Paling Akhir.");
    System.out.println("6. Cek Jumlah Antrian KRS.");
    System.out.println("7. Cek Jumlah Proses KRS.");
    System.out.println("8. Kosongkan Antrian");
    System.out.println("0. Keluar");
    System.out.print("Pilih Menu: ");
    pilihan = sc.nextInt();
    sc.nextLine();

    switch (pilihan) {
        case 1:
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Prodi : ");
            String prodi = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
            antrian.tambahAntrian(mhs);
            break;
        
        case 2:
            antrian.layaniKRS();
            break;

        case 3:
            antrian.tampilkanSemua();
            break;

        case 4:
            antrian.lihatTerdepan();
            break;

        case 5:
            antrian.LihatAkhir();
            break;

        case 6:
            System.out.println("Jumlah Mahasiswa pada Antrian KRS: " + antrian.getJumlahAntrian());
            break;

        case 7:
            System.out.println("Jumlah Mahasiswa yanng sudah Melakukan Proses KRS: " + antrian.getJmlProses());
            break;

        case 8:
            antrian.clear();
            break;

        case 0:
            System.out.println("Terima Kasih.");
            break;

        default:
            System.out.println("Pilihan tidak valid");
        }
    } while (pilihan != 0);
    sc.close();
}
}