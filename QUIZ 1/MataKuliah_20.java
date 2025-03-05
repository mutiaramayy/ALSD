// Class MataKuliah_20
public class MataKuliah_20 {
    private String kodeMK;
    private String namaMK;
    private int sks;

    // Konstruktor
    public MataKuliah_20(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        if (sks >= 2) {
            this.sks = sks;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2, menggunakan nilai default 2.");
            this.sks = 2;
        }
    }

    // Menampilkan informasi mata kuliah
    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK + ", Nama MK: " + namaMK + ", SKS: " + sks);
    }

    // Mengubah nama mata kuliah
    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }

    // Mengubah jumlah SKS dengan validasi
    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2.");
        }
    }

    // Getter untuk SKS
    public int getSKS() {
        return sks;
    }
}
