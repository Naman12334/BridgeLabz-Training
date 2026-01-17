public class RotationPoint {

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
        int idx = findRotationPoint(arr);

        if (idx != -1) {
            System.out.println(arr[idx]);
        }
    }

    public static int findRotationPoint(int[] arr) {

        int i = 0, j = arr.length - 1;

        // Array is not rotated
        if (arr[i] <= arr[j]) return i;

        while (i <= j) {

            int mid = i + (j - i) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if (arr[mid] >= arr[i]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }
}
