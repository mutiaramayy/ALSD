import java.util.Scanner;

public class MainPangkat20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah elemen
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        // Array untuk menyimpan objek Pangkat20
        Pangkat20[] png = new Pangkat20[elemen];

        // Input nilai basis dan pangkat
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();

            png[i] = new Pangkat20(basis, pangkat);
        }

        // Menampilkan hasil Brute Force
        System.out.println("HASIL PANGKAT BRUTE FORCE:");
        for (Pangkat20 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatBF());
        }

        // Menampilkan hasil Divide and Conquer
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat20 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatDC(p.nilai, p.pangkat));
        }

        input.close();
    }
}
