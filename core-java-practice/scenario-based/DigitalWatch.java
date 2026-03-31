public class DigitalWatch {
    public static void main(String[] args) {

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {

                if (h == 13 && m == 0)
                    break;

                System.out.printf("%02d:%02d\n", h, m);
            }

            if (h == 13)
                break;
        }
    }
}
