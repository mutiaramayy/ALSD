package BruteForceDivideConquer;

public class Faktorial20 {
    
    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto *= i;
        }
        return fakto;
    }
    
    public int faktorialDC(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }
}
