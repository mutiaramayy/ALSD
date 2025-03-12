public class Pangkat20 {
    int nilai, pangkat;

    // Konstruktor
    public Pangkat20(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    // Metode Brute Force
    public int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    // Metode Divide and Conquer
    public int pangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a;
            } else {
                return pangkatDC(a, n / 2) * pangkatDC(a, n / 2);
            }
        }
    }
}
