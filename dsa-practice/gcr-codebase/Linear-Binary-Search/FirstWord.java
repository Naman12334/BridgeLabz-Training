public class FirstWord {

    public static void main(String[] args) {

        String[] arr = {"Hi", "I", "Am", "Naman", "Agrawal"};
        String key = "rsh";

        for (String s : arr) {
            if (s.toLowerCase().contains(key.toLowerCase())) {
                System.out.println(s);
            }
        }
    }
}
