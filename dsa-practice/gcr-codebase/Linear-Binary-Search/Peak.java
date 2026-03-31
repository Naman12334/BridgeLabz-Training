public class Peak {

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeak(arr);

        System.out.println("Peak Element: " + arr[peakIndex]);
        System.out.println("Peak Index: " + peakIndex);
    }

    public static int findPeak(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            boolean isLeft = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean isRight = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            if (isLeft && isRight) {
                return mid;
            } 
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
