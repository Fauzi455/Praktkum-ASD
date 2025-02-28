import java.util.Scanner;

public class DosenDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine(); 

        Dosen16[] arrayOfDosen = new Dosen16[jumlahDosen]; 
        String kode, nama;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            kode = sc.nextLine();
            System.out.print("Nama           : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin  : ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia           : ");
            usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen16(kode, nama, jenisKelamin, usia);
        }
        
        DataDosen16 dataDosen = new DataDosen16();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);

        }
    }
