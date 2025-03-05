// Class utama untuk menjalankan program MataKuliah
public class MataKuliahMain_20 {
    public static void main(String[] args) {
        MataKuliah_20 mk1 = new MataKuliah_20("MK101", "Algoritma dan Struktur Data", 3);
        MataKuliah_20 mk2 = new MataKuliah_20("MK102", "Basis Data", 4);
        
        mk1.tampilkanInfo();
        mk1.ubahNamaMK("Pemrograman Berorientasi Objek");
        mk1.ubahSKS(2);
        mk1.tampilkanInfo();
    }
}
