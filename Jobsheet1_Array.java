import java.util.Scanner;

public class Jobsheet1_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] matkul = new String[8][4];
        String[] namaMatkul = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        System.out.println("==================================");
        System.out.println("PROGRAM MENGHITUNNG IP SEMESTER");
        System.out.println("==================================");

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan Nilai Angka Untuk MK " + namaMatkul[i] + ": ");
            matkul[i][1] = sc.nextLine();
        }

        System.out.println("==================================");
        System.out.println("HASIL KONVERSI NILAI");
        System.out.println("==================================");
        
        System.out.printf("%-40s %-15s %-15s %-10s%n", "  Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        double totalBobot = 0;
        for (int i = 0; i < namaMatkul.length; i++) {
            int nilaiAngka = Integer.parseInt(matkul[i][1]);
            String nilaiHuruf;
            int bobotNilai;

            if (nilaiAngka>80 && nilaiAngka<=100) {
                nilaiHuruf = "A";
                bobotNilai = 4;
            } else if (nilaiAngka>73 && nilaiAngka<=80) {
                nilaiHuruf = "B+";
                bobotNilai = 3;
            } else if (nilaiAngka>65 && nilaiAngka<=73) {
                nilaiHuruf = "B";
                bobotNilai = 3;
            } else if (nilaiAngka>60 && nilaiAngka<=65) {
                nilaiHuruf = "C+";
                bobotNilai = 2;
            } else if (nilaiAngka>50 && nilaiAngka<=60) {
                nilaiHuruf = "C";
                bobotNilai = 2;
            } else if (nilaiAngka>29 && nilaiAngka<=50){
                nilaiHuruf = "D";
                bobotNilai = 1;
            } else {
                nilaiHuruf = "E";
                bobotNilai = 0;
            }
            totalBobot+=bobotNilai;
            System.out.printf("%-43s %-15d %-15s %-10d%n", namaMatkul[i], nilaiAngka, nilaiHuruf, bobotNilai);
        }
        System.out.println("==================================");
        System.out.println("IP: " + totalBobot/8);
    }
}