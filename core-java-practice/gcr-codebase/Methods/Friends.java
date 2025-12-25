import java.util.*;

public class Friends {
     static int youngest(int[] a) {
        return Math.min(a[0], Math.min(a[1], a[2]));
    }

    static int tallest(int[] h) {
        return Math.max(h[0], Math.max(h[1], h[2]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        int[] ht = new int[3];

        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) ht[i] = sc.nextInt();

        System.out.println("Youngest Age: " + youngest(age));
        System.out.println("Tallest Height: " + tallest(ht));
    }
    
}
