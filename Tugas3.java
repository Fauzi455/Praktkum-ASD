import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
    
        String[] namaMataKuliah = new String[jumlah];
        int[] sks = new int[jumlah];
        int[] semester = new int[jumlah];
        String[] hariKuliah = new String[jumlah];
    
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            System.out.print("Hari Kuliah: ");
            sc.nextLine();
            hariKuliah[i] = sc.nextLine();
            }
    
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Kuliah Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Kuliah Berdasarkan Semester");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
    
        switch (pilihan) {
            case 1:
            System.out.printf("%-40s %-15s %-15s %-10s%n", "Mata Kuliah", "SKS", "Semester", "Hari");
                for (int i = 0; i < jumlah; i++) {
                System.out.printf("%-40s %-15d %-15d %-10s%n", namaMataKuliah[i], sks[i], semester[i], hariKuliah[i]);
            }
                break;
    
            case 2:
            System.out.print("Masukkan Hari Kuliah: ");
                String hari = sc.nextLine();
                System.out.println("Jadwal Kuliah Pada Hari " + hari + ":");
                    for (int i = 0; i < jumlah; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(hari)) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i]);
                            }
                        }break;
    
            case 3:
            System.out.print("Masukkan Semester: ");
            int sem = sc.nextInt();
                System.out.println("Jadwal Kuliah Pada Semester " + sem + ":");
                    for (int i = 0; i < jumlah; i++) {
                        if (semester[i] == sem) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Hari: " + hariKuliah[i]);
                    }
                        }break;
    
                    case 4:
                        break;
                }
            }
        }
    }

