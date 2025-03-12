public class MaxUts {
    public static int findMaxUTS(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left]; // Base case: hanya satu elemen
        }

        int mid = (left + right) / 2;
        int maxLeft = findMaxUTS(arr, left, mid);
        int maxRight = findMaxUTS(arr, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }
} 
