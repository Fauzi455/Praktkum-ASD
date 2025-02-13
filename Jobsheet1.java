import java.util.Scanner;
public class Jobsheet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double tugas, kuis, UTS, UAS, nilaiAkhir;
String nilaiHuruf;

System.out.println();
System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
System.out.println("===============================");

    System.out.print("Masukkan Nilai Tugas: ");
    tugas = sc.nextDouble();
    System.out.print("Masukkan Nilai Kuis: ");
    kuis = sc.nextDouble();
    System.out.print("Masukkan Nilai UTS: ");
    UTS = sc.nextDouble();
    System.out.print("Masukkan Nilai UAS: ");
    UAS = sc.nextDouble();
    
System.out.println("===============================");
    
    nilaiAkhir=(tugas * 0.2) + (kuis * 0.2) + (UTS * 0.3) + (UAS * 0.3);
    
    if (tugas<0 || tugas>100 && kuis<0 || kuis>100 && UTS<0 || UTS>100 && UAS<0 || UAS>100) {
        System.out.println("Nilai Tidak Valid");
        return;
        }

    if (nilaiAkhir>80 && nilaiAkhir<=100) {
        nilaiHuruf = ("A");
    } else if (nilaiAkhir>73 && nilaiAkhir<=80) {
        nilaiHuruf = ("B+");
    } else if (nilaiAkhir>65 && nilaiAkhir<=73) {
        nilaiHuruf = ("B");
    } else if (nilaiAkhir>60 && nilaiAkhir<=65) {
        nilaiHuruf = ("C+");
    } else if (nilaiAkhir>50 && nilaiAkhir<=60) {
        nilaiHuruf = ("C");
    } else if (nilaiAkhir>39 && nilaiAkhir<=50) {
        nilaiHuruf = ("D");
    } else {
        nilaiHuruf = ("E");
    }
    
    System.out.println("===============================");
    System.out.println("Nilai Akhir: " + nilaiAkhir);
    System.out.println("Nilai Huruf: " + nilaiHuruf);
System.out.println("===============================");
    
    if(nilaiAkhir>50){
        System.out.println("Selamat Anda Lulus");
    }else{
        System.out.println("Mohon Maaf, Anda Tidak Lulus");
    }
System.out.println("===============================");

    }
}