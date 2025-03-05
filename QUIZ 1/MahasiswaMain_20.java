// Class utama untuk menjalankan program Mahasiswa
public class MahasiswaMain_20 {
    public static void main(String[] args) {
        Mahasiswa_20 mhs = new Mahasiswa_20("244107060041", "Mutiara Inayah Maylafaiza", 2024, 5);
        MataKuliah_20 mk1 = new MataKuliah_20("MK101", "Algoritma dan Struktur Data", 3);
        MataKuliah_20 mk2 = new MataKuliah_20("MK102", "Basis Data", 4);
        
        mhs.tambahMataKuliah(mk1);
        mhs.tambahMataKuliah(mk2);
        
        mhs.tampilkanInfo();
        System.out.println("Total SKS: " + mhs.hitungTotalSKS());
    }
}
