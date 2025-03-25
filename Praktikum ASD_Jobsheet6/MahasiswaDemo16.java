import java.util.Scanner;
public class MahasiswaDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16();

        for (int i = 0; i < 5; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            System.out.println("--------------------");
            sc.nextLine();

        Mahasiswa16 mhs = new Mahasiswa16(nim, nama, kelas, ipk);
        list.tambah(mhs);
    }
    System.out.println();
    System.out.println("Data mahasiswa sebelum sorting: "); 
    list.tampil(); 

    System.out.println();
    System.out.println("Data Mahasiswa setelah Sorting berdasarkan IPK (DESC): ");
    list.bubbleSort();
    list.tampil();

    System.out.println();
    System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
    list.selectionSort();
    list.tampil();

    System.out.println();
    System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)");
    list.insertionSort();
    list.tampil();

    }  
}
