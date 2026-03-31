import java.util.*;

class ReverseList {
    public static <T> void reverseList(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseList(arr);
        System.out.println(arr);

        List<Integer> link = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverseList(link);
        System.out.println(link);
    }
}
