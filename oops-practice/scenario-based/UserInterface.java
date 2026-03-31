import java.util.Scanner;


abstract class GoodsTransport {

    protected String transportId;
    protected String transportDate;
    protected int transportRating;

    public GoodsTransport(String transportId, String transportDate, int transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public String getTransportId() {
        return transportId;
    }

    public String getTransportDate() {
        return transportDate;
    }

    public int getTransportRating() {
        return transportRating;
    }

    public abstract String vehicleSelection();

    public abstract float calculateTotalCharge();
}


class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    public int getBrickQuantity() {
        return brickQuantity;
    }

    public float getBrickPrice() {
        return brickPrice;
    }

    @Override
    public String vehicleSelection() {
        if (brickQuantity < 300) {
            return "Truck";
        } else if (brickQuantity <= 500) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }

    @Override
    public float calculateTotalCharge() {

        float price = brickPrice * brickQuantity;
        float tax = price * 0.30f;

        float discount = 0;
        if (transportRating == 5) {
            discount = price * 0.20f;
        } else if (transportRating == 3 || transportRating == 4) {
            discount = price * 0.10f;
        }

        float vehiclePrice;
        String vehicle = vehicleSelection();

        if (vehicle.equalsIgnoreCase("Truck")) {
            vehiclePrice = 1000;
        } else if (vehicle.equalsIgnoreCase("Lorry")) {
            vehiclePrice = 1700;
        } else {
            vehiclePrice = 3000;
        }

        return (price + tax + vehiclePrice) - discount;
    }
}


class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public String getTimberType() {
        return timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    @Override
    public String vehicleSelection() {

        double area = 2 * 3.147 * timberRadius * timberLength;

        if (area < 250) {
            return "Truck";
        } else if (area <= 400) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }

    @Override
    public float calculateTotalCharge() {

        double volume = 3.147 * timberRadius * timberRadius * timberLength;

        double rate;
        if (timberType.equalsIgnoreCase("Premium")) {
            rate = 0.25;
        } else {
            rate = 0.15;
        }

        double price = volume * timberPrice * rate;
        double tax = price * 0.30;

        double discount = 0;
        if (transportRating == 5) {
            discount = price * 0.20;
        } else if (transportRating == 3 || transportRating == 4) {
            discount = price * 0.10;
        }

        double vehiclePrice;
        String vehicle = vehicleSelection();

        if (vehicle.equalsIgnoreCase("Truck")) {
            vehiclePrice = 1000;
        } else if (vehicle.equalsIgnoreCase("Lorry")) {
            vehiclePrice = 1700;
        } else {
            vehiclePrice = 3000;
        }

        return (float) ((price + tax + vehiclePrice) - discount);
    }
}


class Utility {

    public static boolean validate(String transportId) {
        return transportId.matches("[A-Z]{3}[0-9]{3}[A-Z]");
    }

    public static GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        String transportId = data[0];

        if (!validate(transportId)) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return null;
        }

        String date = data[1];
        int rating = Integer.parseInt(data[2]);
        String type = data[3];

        if (type.equalsIgnoreCase("BrickTransport")) {

            float brickSize = Float.parseFloat(data[4]);
            int brickQty = Integer.parseInt(data[5]);
            float brickPrice = Float.parseFloat(data[6]);

            return new BrickTransport(
                    transportId, date, rating,
                    brickSize, brickQty, brickPrice
            );
        }

        if (type.equalsIgnoreCase("TimberTransport")) {

            float length = Float.parseFloat(data[4]);
            float radius = Float.parseFloat(data[5]);
            String timberType = data[6];
            float timberPrice = Float.parseFloat(data[7]);

            return new TimberTransport(
                    transportId, date, rating,
                    length, radius, timberType, timberPrice
            );
        }

        return null;
    }

    public static String findObjectType(GoodsTransport goodsTransport) {

        if (goodsTransport instanceof TimberTransport) {
            return "TimberTransport";
        } else if (goodsTransport instanceof BrickTransport) {
            return "BrickTransport";
        }

        return "";
    }
}


public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        GoodsTransport goodsTransport = Utility.parseDetails(input);

        if (goodsTransport == null) {
            return;
        }

        System.out.println("Transporter id : " + goodsTransport.getTransportId());
        System.out.println("Date of transport : " + goodsTransport.getTransportDate());
        System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());

        String type = Utility.findObjectType(goodsTransport);

        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) goodsTransport;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        }

        if (type.equals("TimberTransport")) {
            TimberTransport tt = (TimberTransport) goodsTransport;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
        }

        System.out.println("Vehicle for transport : " + goodsTransport.vehicleSelection());
        System.out.println("Total charge : " + goodsTransport.calculateTotalCharge());
    }
}
