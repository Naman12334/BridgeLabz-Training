class Circle {
    private double r;

    Circle() {
        this(1.0);   
    }

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }
}
