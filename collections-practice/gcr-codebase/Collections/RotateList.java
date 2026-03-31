import java.util.*;

class RotateList {
    public static void rotate(List<Integer> list, int k) {
        k = k % list.size();
        List<Integer> temp = new ArrayList<>(list.subList(0, k));
        list.removeAll(temp);
        list.addAll(temp);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        rotate(list, 2);
        System.out.println(list);
    }
}
