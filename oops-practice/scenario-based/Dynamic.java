import java.util.*;
import java.util.regex.*;

public class Dynamic {

    static String process(String type, String value) {

        try {

            if (type.equals("UPPER"))
                return value.toUpperCase();

            if (type.equals("LOWER"))
                return value.toLowerCase();

            if (type.equals("DATE")) {

                String[] p = value.split("-");

                int d = Integer.parseInt(p[0]);
                int m = Integer.parseInt(p[1]);
                int y = Integer.parseInt(p[2]);

                if (d > 31 || m > 12)
                    return "INVALID";

                return y + "/" + String.format("%02d", m) + "/" + String.format("%02d", d);
            }

            if (type.equals("REPEAT")) {

                String[] p = value.split(",");
                String word = p[0];
                int c = Integer.parseInt(p[1]);

                return word.repeat(c);
            }

        } catch (Exception e) {
            return "INVALID";
        }

        return "INVALID";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Pattern pattern = Pattern.compile("\\$\\{(\\w+):(.*?)\\}");

        while (n-- > 0) {

            String line = sc.nextLine();
            Matcher m = pattern.matcher(line);

            StringBuffer result = new StringBuffer();

            while (m.find()) {

                String type = m.group(1);
                String value = m.group(2);

                m.appendReplacement(result, process(type, value));
            }

            m.appendTail(result);

            System.out.println(result);
        }
    }
}