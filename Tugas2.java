import java.util.Scanner;
public class Tugas2 {

    public static int hitungVolume (int sisi){
        int volume = sisi*sisi*sisi;
        return volume;
    }

    public static int luasPermukaan (int sisi){
        int luas = 6*sisi*sisi;
        return luas;
    }

    public static int hitungKeliling (int sisi){
        int keliling = 12*sisi;
        return keliling;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("== MENU ==");
    System.out.println("1. Hitung Volume Kubus");
    System.out.println("2. Hitung Luas Permukaan Kubus");
    System.out.println("3. Hitung Keliling Kubus");
    System.out.print("Masukkan Pilihan: ");
    int pilihan = sc.nextInt();

    System.out.print("Masukkan Panjang sisi Kubus: ");
    int sisi = sc.nextInt();

    switch (pilihan) {
        case 1:
            int volume = hitungVolume(sisi);
            System.out.println(" Volume Kubus: " + volume);
            break;
        case 2:
            int luas = luasPermukaan(sisi);
            System.out.println("Luas Permukaan Kubus: " + luas);
            break;
        case 3:
            int keliling = hitungKeliling(sisi);
            System.out.println("Keliling Kubus: " + keliling);
            break;
        }
    }
}

