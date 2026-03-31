public class ComparePerformance {

    public static void main(String[] args) {

        System.out.println("For String: ");
        String s = "";

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            s += "harsh";
        }
        long endTime1 = System.currentTimeMillis();

        System.out.println("Time in ms: " + (endTime1 - startTime1));

        System.out.println("\nFor StringBuilder: ");
        StringBuilder sb = new StringBuilder();

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            sb.append("harsh");
        }
        long endTime2 = System.currentTimeMillis();

        System.out.println("Time in ms: " + (endTime2 - startTime2));
    }
}
