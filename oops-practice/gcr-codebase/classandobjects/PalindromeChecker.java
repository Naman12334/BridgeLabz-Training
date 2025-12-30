class PalindromeChecker {
    String txt;

    boolean isPal() {
        String s = txt.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);

        return s.equals(rev);
    }

    void show() {
        if (isPal())
            System.out.println(txt + " is palindrome");
        else
            System.out.println(txt + " is not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker();
        p1.txt = "A man a plan a canal Panama";

        PalindromeChecker p2 = new PalindromeChecker();
        p2.txt = "Hello";

        p1.show();
        p2.show();
    }
}
