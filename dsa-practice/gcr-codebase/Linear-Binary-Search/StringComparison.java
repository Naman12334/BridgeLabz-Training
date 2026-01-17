public class StringComparison {

    public static void main(String[] args) {

        int iterations = 1_000_000;

        // StringBuilder
        long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("hello");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end1 - start1) + " ms");

        // StringBuffer
        long start2 = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append("hello");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end2 - start2) + " ms");
    }
}
