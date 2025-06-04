import java.util.Scanner;
public class DLLMain {
    public static void main(String[] args) {
    DoubleLinkedList01 list = new DoubleLinkedList01();
    Scanner scan = new Scanner(System.in);
    int pilihan;

do{
    System.out.println("\nMenu Double Linked List Mahasiswa");
    System.out.println("1. Tambah di awal");
    System.out.println("2. Tambah di akhir");
    System.out.println("3. Hapus di awal");
    System.out.println("4. Hapus di akhir");
    System.out.println("5. Tampilkan data");
    System.out.println("6. Cari Mahasiswa berdasarkan NIM");
    System.out.println("0. Keluar");
    System.out.print("Pilih Menu: ");
    pilihan = scan.nextInt();
    scan.nextLine();

    switch (pilihan) {
        case 1 ->{
            System.out.print("Masukkan NIM: ");
            String nim = scan.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = scan.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = scan.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = scan.nextDouble();
            scan.nextLine();

            Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);
            list.addFirst(mhs);
        }

        case 2 ->{
            System.out.print("Masukkan NIM: ");
            String nim = scan.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = scan.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = scan.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = scan.nextDouble();
            scan.nextLine();

            Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);
            list.addLast(mhs);
        }

        case 3 -> list.removeFirst();
        case 4 -> list.removeLast();
        case 5 -> list.print();
        case 6 -> {
            System.out.print("Masukkan NIM yang dicari: ");
            String nim = scan.nextLine();
            Node01 found = list.search(nim);
            if (found != null) {
                System.out.println("Data ditemukan");
                found.data.tampil();
            } else{
                System.out.println("Data tidak ditemukan");
            }
        }

        case 0 -> System.out.println("Keluar dari program.");
        default -> System.out.println("Pilihan tidak valid!");
        }
    } while (pilihan != 0);
        scan.close();
}
}
