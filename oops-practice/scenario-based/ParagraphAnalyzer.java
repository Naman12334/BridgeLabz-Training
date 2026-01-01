public class ParagraphAnalyzer {

    public static void analyze(String p, String oldW, String newW) {

        if (p == null || p.trim().isEmpty()) {
            System.out.println("Empty paragraph.");
            return;
        }

        String[] arr = p.trim().split("\\s+");
        int cnt = arr.length;

        String longW = arr[0];
        for (String w : arr) {
            if (w.length() > longW.length())
                longW = w;
        }

        String rep = p.replaceAll("(?i)\\b" + oldW + "\\b", newW);

        System.out.println("Word Count: " + cnt);
        System.out.println("Longest Word: " + longW);
        System.out.println("Replaced Paragraph:");
        System.out.println(rep);
    }

    public static void main(String[] args) {

        String para = "Java is not powerful. java is not fast and Java is  difficult to learn. I love java the most";

        analyze(para, "java", "Python");
    }
}
