public class MinUts {
    public static int findMinUts(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left]; 
        }

        int mid = (left + right) / 2;
        int minLeft = findMinUts(arr, left, mid);
        int minRight = findMinUts(arr, mid + 1, right);

        return Math.min(minLeft, minRight);
    }
}
