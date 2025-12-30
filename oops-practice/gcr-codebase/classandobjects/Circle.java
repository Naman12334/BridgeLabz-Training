class Circle {
    double r;

    void calc() {
        double area = Math.PI * r * r;
        double cir = 2 * Math.PI * r;

        System.out.printf("Area of circle: %.4f\n", area);
        System.out.printf("Circumference of circle: %.4f\n", cir);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 2.5;
        c.calc();
    }
}
