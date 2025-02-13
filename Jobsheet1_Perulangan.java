import java.util.Scanner;
public class Jobsheet1_Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

String NIM, duaAngkaTerakhir;

    System.out.print("Input NIM: ");
    NIM = sc.nextLine();
        
    duaAngkaTerakhir = NIM.substring(NIM.length()-2);
    int n = Integer.parseInt(duaAngkaTerakhir);
        
    if (n<10) {
        n+=10;
    }
        
    for (int i=1; i<=n; i++) {
        if (i==6 || i==10) {
            continue;
        }
        if (i % 2 == 0) {
            System.out.print(i);
        } else {
            System.out.print(" *  ");
            }
        }
    }
}
