public class MainMinUts {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82}; // Data nilai UTS
        int minUTS = MinUts.findMinUts(nilaiUTS, 0, nilaiUTS.length - 1); // Panggil metode

        System.out.println("Nilai UTS terendah: " + minUTS); // Cetak hasil
    }
}
