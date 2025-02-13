import java.util.Scanner;
public class Jobsheet1_Fungsi1 {
    public static int[][] stokBunga={
        { 10, 5, 15, 7 },
        { 6, 11, 9, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 }
    };
    
    public static int[] hargaBunga={
        75000, 50000, 60000, 10000
    };

    public static String[] bunga={
        "Aglonema",
        "Keladi",
        "Alocasia",
        "Mawar",
    };

    public static String[] cabang={
        "Royal Garden 1",
        "Royal Garden 2",
        "Royal Garden 3",
        "Royal Garden 4",
    };


    public static int [][] hasil = new int[stokBunga.length][bunga.length];
    public static void main(String[] args) {
        for (int i = 0; i < stokBunga.length; i++) {
            int habisTerjual = 0;
            for (int j = 0; j < bunga.length; j++) {
                int totalPenjualan = stokBunga[i][j] * hargaBunga[j];
                habisTerjual+=totalPenjualan;
            }
            System.out.println("Hasil Penjualan Cabang " + cabang[i] + " adalah Rp." + habisTerjual);
        }
    }
}
