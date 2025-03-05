// Class Mahasiswa_20
public class Mahasiswa_20 {
    private String nim;
    private String nama;
    private int tahunMasuk;
    private MataKuliah_20[] mataKuliahDiambil;
    private int jumlahMK;

    // Konstruktor
    public Mahasiswa_20(String nim, String nama, int tahunMasuk, int kapasitasMK) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new MataKuliah_20[kapasitasMK];
        this.jumlahMK = 0;
    }

    // Menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Mata Kuliah Diambil:");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("---------------------------------");
            mataKuliahDiambil[i].tampilkanInfo();
            System.out.println("---------------------------------");
        }
    }

    // Menambahkan mata kuliah
    public void tambahMataKuliah(MataKuliah_20 mataKuliah) {
        if (jumlahMK < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMK] = mataKuliah;
            jumlahMK++;
        } else {
            System.out.println("Tidak dapat menambahkan mata kuliah lagi.");
        }
    }

    // Menghitung total SKS
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMK; i++) {
            totalSKS += mataKuliahDiambil[i].getSKS();
        }
        return totalSKS;
    }
}
