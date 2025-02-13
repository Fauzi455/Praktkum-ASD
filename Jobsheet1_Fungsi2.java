import java.util.Scanner;
public class Jobsheet1_Fungsi2 {
    public static int[][] stokBunga = {
        { 10, 5, 15, 7 },
        { 6, 11, 9, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 }
    };

    public static int[] hargaBunga = {
        75000, 50000, 60000, 10000
    };

    public static String[] bunga = {
        "Aglonema",
        "Keladi",
        "Alocasia",
        "Mawar",
    };

    public static String[] cabang = {
        "Royal Garden 1",
        "Royal Garden 2",
        "Royal Garden 3",
        "Royal Garden 4",
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

            System.out.println("Selamat Datang di Royal Garden");
            System.out.println("Menu:");
            System.out.println("1. Cek Pendapatan");
            System.out.println("2. Cek Stok");
            System.out.println("3. Edit Stok");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    cekPendapatan();
                    break;
                case 2:
                    cekStok();
                    break;
                case 3:
                    editStok();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
            }
        }

    public static void cekPendapatan() {
        for (int i = 0; i < stokBunga.length; i++) {
            int habisTerjual = 0;
            for (int j = 0; j < bunga.length; j++) {
                int totalPenjualan = stokBunga[i][j] * hargaBunga[j];
                habisTerjual+=totalPenjualan;
            }
            System.out.println("Hasil Penjualan Cabang " + cabang[i] + " adalah Rp." + habisTerjual);
        }
    }

    public static void cekStok() {
        System.out.println();
        System.out.println("Stok Bunga");
        for (int i = 0; i < cabang.length; i++) {
            System.out.println(cabang[i]);
            for (int j = 0; j < bunga.length; j++) {
                System.out.println("  " + bunga[j] + ": " + stokBunga[i][j]);
            }
        }
    }
}
