public class ConcatenateStrings {

    public static void main(String[] args) {

        String[] arr = {"Hi", "I", "Am", "Naman", "Agrawal"};
        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        System.out.println(sb.toString());
    }
}
