import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] kodePlat = {
            "A",
            "B",
            "D",
            "E",
            "F",
            "G",
            "H",
            "L",
            "N",
            "T"
        };
        
        String[][] kota = {
            {"BANTEN"},
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"}
        };
        
    System.out.print("Masukkan Kode Plat Mobil : ");
    String inputKode = sc.nextLine();
        
    for (int i = 0; i < kodePlat.length; i++) {
        if (inputKode.equals(kodePlat[i])) {
            System.out.println("Nama Kota untuk Kode Plat " + inputKode + " adalah : " + kota[i][0]);
            break;
                    }
                }
            }
        }
