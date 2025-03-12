public class MainAverageUAS {
    public static void main(String[] args) {
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
        double avgUAS = AverageUAS.calculateAverage(nilaiUAS);
        System.out.println("Rata-rata nilai UAS: " + avgUAS);
    }
}
