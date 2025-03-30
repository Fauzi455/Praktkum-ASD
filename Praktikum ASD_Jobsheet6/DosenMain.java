import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

DataDosen16 data = new DataDosen16();
int pilihan;

    do {
        System.out.println("Menu:");
        System.out.println("1. Tambah Data Dosen");
        System.out.println("2. Tampil Data Dosen");
        System.out.println("3. Sorting ASC (dari termuda ke tertua)");
        System.out.println("4. Sorting DSC (dari tertua ke termuda)");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = sc.nextInt();
        sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode         : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama         : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin: ");
                    boolean jenisKelamin = sc.nextBoolean();
                    System.out.print("Usia         : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen16 dosen = new Dosen16(kode, nama, jenisKelamin, usia);
                    data.tambah(dosen);
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Sorting dari termuda ke tertua");
                    data.tampil();
                    break;

                case 4:
                    data.SortingDSC();
                    System.out.println("Sorting dari tertua ke termuda");
                    data.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari program");
                    break;
            }

            System.out.println();
        } while (pilihan != 5);
    }
}