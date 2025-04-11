import java.util.Scanner;
public class DosenDemo16 {
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
        System.out.println("5. Cari Nama Dosen");
        System.out.println("6. Cari Usia");
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
                    System.out.print("Nama : ");
                    String cari = sc.nextLine();
            
                    System.out.println("Menggunakan Sequential Searching");
                    int posisi = data.PencarianDataSequential16(cari);
                    data.tampilPosisi(cari, posisi);
                    data.tampilDataSearch(cari, posisi);
                    break;
                case 6:
                    System.out.print("Usia : ");
                    int cariUsia = sc.nextInt();
 
                    System.out.println("Menggunakan Binary Search");
                    int posisi2 = data.PencarianDataBinary16(cariUsia, 0, 1);
                    data.posisiUsia(cariUsia, posisi2);
                    data.tampilUsia(cariUsia, posisi2);
                    break;
                
            }
            System.out.println();
        } while (pilihan != 7);
    }
}