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
    System.out.println("7. Sisipkan Data Baru");
    System.out.println("8. Tambah Data di Indeks Tertentu");
    System.out.println("9. Hapus Data Setelah Data Key ");
    System.out.println("10. Hapus Data di Indeks Tertentu");
    System.out.println("11. Tampilkan Data di Head, Tail dan Indeks Tertentu");
    System.out.println("12. Jumlah Data pada DLL");
    System.out.println("0. Keluar");
    System.out.print("Pilih Menu: ");
    pilihan = scan.nextInt();
    scan.nextLine();

    switch (pilihan) {
        case 1 ->{
            Mahasiswa01 mhs = list.inputMahasiswa(scan);
            list.addFirst(mhs);
        }

        case 2 ->{
            Mahasiswa01 mhs = list.inputMahasiswa(scan);
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
        case 7 -> {
            System.out.print("Masukkan NIM yang dicari: ");
            String key = scan.nextLine();
            list.insertAfter(key, list.inputMahasiswa(scan));
        }
        case 8 -> {
            System.out.print("Masukkan Index: ");
            int index = scan.nextInt();
            scan.nextLine();
            list.add(index, list.inputMahasiswa(scan));
        }
        case 9 -> {
            System.out.print("Masukkan NIM: ");
            String key = scan.nextLine();
            list.removeAfter(key);
        }
        case 10 -> {
            System.out.print("Masukkan Indeks: ");
            int index = scan.nextInt();
            list.remove(index);
        }
        case 11 -> {
            Mahasiswa01 first = list.getFirst();
            if (first != null) {
                System.out.println("Data Mahasiswa Terdepan: ");
                first.tampil();
            }
            System.out.println();
            Mahasiswa01 last = list.getLast();
            if (last != null) {
                System.out.println("Data Mahasiswa Terakhir: ");
                last.tampil();
            }
            System.out.println();
            int indeks = -1;
            System.out.print("Masukkan Indeks: ");
            indeks = scan.nextInt();
            scan.nextLine();
            Mahasiswa01 index = list.getIndex(indeks);
            System.out.println("Data Indeks ke-" + indeks);
            index.tampil();
        }
        case 12 -> {
            System.out.println("Jumlah Data pada Double Linked List: " + list.getSize());
        }
        case 0 -> System.out.println("Keluar dari program.");
        default -> System.out.println("Pilihan tidak valid!");
        }
    } while (pilihan != 0);
        scan.close();
    }
}
