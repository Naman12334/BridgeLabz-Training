public class SearchIn2DSortedMatrix {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        findTarget(arr, 16);
    }

    public static void findTarget(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;
        boolean found = false;

        for (int i = 0; i < rows; i++) {

            int left = 0;
            int right = cols - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (arr[i][mid] == target) {
                    System.out.println("Target found at row " + i + " column " + mid);
                    found = true;
                    break;
                } 
                else if (arr[i][mid] < target) {
                    left = mid + 1;
                } 
                else {
                    right = mid - 1;
                }
            }

            if (found) break;
        }

        if (!found) {
            System.out.println("Target not found");
        }
    }
}
