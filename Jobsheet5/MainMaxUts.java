public class MainMaxUts {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int maxUTS = MaxUts.findMaxUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS tertinggi: " + maxUTS);
    }
}
