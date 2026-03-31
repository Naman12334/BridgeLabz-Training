class Bonus {
    static double[][] gen() {
        double[][] d = new double[10][2];
        for (int i = 0; i < 10; i++) {
            d[i][0] = 10000 + Math.random() * 90000;
            d[i][1] = Math.random() * 10;
        }
        return d;
    }

    static double[][] calc(double[][] d) {
        double[][] r = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double sal = d[i][0];
            double yr = d[i][1];
            double b = (yr > 5) ? sal * 0.05 : sal * 0.02;
            r[i][0] = sal;
            r[i][1] = sal + b;
            r[i][2] = b;
        }
        return r;
    }
}
