class CarRental {
    String cust;
    String car;
    int days;

    CarRental(String cust, String car, int days) {
        this.cust = cust;
        this.car = car;
        this.days = days;
    }

    double totalCost() {
        return days * 1500;
    }
}
