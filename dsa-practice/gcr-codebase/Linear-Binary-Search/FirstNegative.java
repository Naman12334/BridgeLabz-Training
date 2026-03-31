public class FirstNegative {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 5, 2, -10, 5, 88, 0, -9, 55};

        for (int i : arr) {
            if (i < 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
