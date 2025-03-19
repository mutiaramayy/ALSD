import java.util.Scanner;

public class DosenMain20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen20 data = new DataDosen20();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting Usia ASC (Bubble Sort)");
            System.out.println("4. Sorting Usia DSC (Selection Sort)");
            System.out.println("5. Sorting Usia DSC (Insertion Sort)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode dosen: ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = input.nextLine();
                    System.out.print("Jenis Kelamin (L = Laki-laki, P = Perempuan): ");
                    char jk = input.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Masukkan usia dosen: ");
                    int usia = input.nextInt();

                    Dosen20 dsn = new Dosen20(kode, nama, jenisKelamin, usia);
                    data.tambah(dsn);
                    break;

                case 2:
                    System.out.println("\nData Dosen:");
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Data setelah sorting ASC:");
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Data setelah sorting DSC (Selection Sort):");
                    data.tampil();
                    break;

                case 5:
                    data.insertionSort();
                    System.out.println("Data setelah sorting DSC (Insertion Sort):");
                    data.tampil();
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }
}
