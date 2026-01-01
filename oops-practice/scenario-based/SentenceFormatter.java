public class SentenceFormatter {

    public static String formatText(String s) {

        if (s == null || s.trim().isEmpty())
            return "";

        s = s.trim().replaceAll("\\s+", " ");

        StringBuilder res = new StringBuilder();
        boolean cap = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (cap && Character.isLetter(ch)) {
                res.append(Character.toUpperCase(ch));
                cap = false;
            } else {
                res.append(ch);
            }

            if (ch == '.' || ch == '?' || ch == '!') {
                cap = true;
                if (i + 1 < s.length() && s.charAt(i + 1) != ' ')
                    res.append(' ');
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String para = "hello   world.this is   java!how are you?i am fine.";
        System.out.println(formatText(para));
    }
}
