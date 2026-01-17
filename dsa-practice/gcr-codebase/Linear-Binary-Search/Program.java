public class Program {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5};
        int target = 3;

        int missing = findFirstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missing);

        int index = binarySearch(arr, target);

        if (index == -1)
            System.out.println("Target not found");
        else
            System.out.println("Target found at index: " + index);
    }

    public static int findFirstMissingPositive(int[] arr) {

        boolean[] visited = new boolean[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] <= arr.length) {
                visited[arr[i]] = true;
            }
        }

        for (int i = 1; i <= arr.length; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return arr.length + 1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}
