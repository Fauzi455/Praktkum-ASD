import java.util.Scanner;
public class SuratDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    StackSurat16 stack = new StackSurat16(3);
    int pilih;

     do {
        System.out.println("\nMenu:");
        System.out.println("1. Terima Surat Izin");
        System.out.println("2. Proses Surat Izin");
        System.out.println("3. Lihat Surat Izin Terakhir");
        System.out.println("4. Cari Surat");
        System.out.print("Pilih: ");
        pilih = sc.nextInt();
        sc.nextLine();

        switch (pilih) {
            case 1:
                System.out.print("ID Surat\t: ");
                String idSurat = sc.nextLine();
                System.out.print("Nama Mahasiswa\t: ");
                String namaMahasiswa = sc.nextLine();
                System.out.print("Kelas\t\t: ");
                String kelas = sc.nextLine();
                System.out.print("Jenis Izin\t: ");
                char jenisIzin = sc.nextLine().charAt(0);
                System.out.print("Durasi\t\t: ");
                int durasi = sc.nextInt();
                Surat16 srt = new Surat16(idSurat, namaMahasiswa, kelas, jenisIzin, durasi );
                stack.push(srt);
                System.out.println("Surat izin dari " + srt.namaMahasiswa + " berhasil dikumpulkan.");
                break;
        
            case 2:
                Surat16 proses = stack.pop();
                if (proses != null) {
                    System.out.println("Surat " + proses.jenisIzin + " dari " + proses.namaMahasiswa + " berhasil diverifikasi.");
                }
                break;

            case 3:
                System.out.println("Daftar Semua Surat");
                System.out.println("ID Surat\tNama\tKelas\tJenis Izin\tDurasi");
                stack.print();
                break;

            case 4:
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = sc.nextLine();
                if (stack.cari(nama)) {
                    System.out.println("Surat dengan nama " + nama + " ditemukan");
                } else{
                    System.out.println("Surat dengan nama " + nama + " tidak ditemukan");
    
                }
                break;

            default:
                System.out.println("Pilihan tidak valid");
            
            }
        } while (pilih >= 1 && pilih <=4);
        
    }
    
}
