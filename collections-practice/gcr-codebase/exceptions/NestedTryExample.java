class NestedTryExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            int index = 1;
            int divisor = 0;

            try {
                System.out.println(arr[index] / divisor);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
