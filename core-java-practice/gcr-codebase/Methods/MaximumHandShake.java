import java.util.*;

public class MaximumHandShake {
      static int calcHS(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hs = calcHS(n);

        System.out.println("Maximum handshakes: " + hs);
    }
    
}
