import java.util.*;

// custom exception
class RoomNotAvailableException extends Exception {
    public RoomNotAvailableException(String msg) {
        super(msg);
    }
}

// pricing strategy interface
interface PricingStrategy {
    double calc(double base, int days);
}

// normal pricing
class NormalPricing implements PricingStrategy {
    public double calc(double base, int days) {
        return base * days;
    }
}

// seasonal pricing
class SeasonalPricing implements PricingStrategy {
    public double calc(double base, int days) {
        return base * days * 1.2;
    }
}

// room base class
abstract class Room {
    int no;
    double price;
    boolean booked;

    public Room(int no, double price) {
        this.no = no;
        this.price = price;
        this.booked = false;
    }

    abstract String getType();
}

// standard room
class StandardRoom extends Room {
    public StandardRoom(int no) {
        super(no, 2000);
    }

    String getType() {
        return "Standard";
    }
}

// deluxe room
class DeluxeRoom extends Room {
    public DeluxeRoom(int no) {
        super(no, 3500);
    }

    String getType() {
        return "Deluxe";
    }
}

// guest class
class Guest {
    int id;
    String name;

    public Guest(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// reservation class
class Reservation {
    Room room;
    Guest guest;
    int days;

    public Reservation(Room room, Guest guest, int days) {
        this.room = room;
        this.guest = guest;
        this.days = days;
    }
}

// hotel management
class Hotel {
    List<Room> rooms = new ArrayList<>();
    List<Reservation> res = new ArrayList<>();

    public void addRoom(Room r) {
        rooms.add(r);
    }

    // book room
    public Reservation book(String type, Guest g, int days)
            throws RoomNotAvailableException {

        for (Room r : rooms) {
            if (!r.booked && r.getType().equalsIgnoreCase(type)) {
                r.booked = true;
                Reservation rv = new Reservation(r, g, days);
                res.add(rv);
                return rv;
            }
        }
        throw new RoomNotAvailableException(type + " room not available");
    }

    // check-out & invoice
    public double checkout(Reservation rv, PricingStrategy ps) {
        rv.room.booked = false;
        return ps.calc(rv.room.price, rv.days);
    }
}

// main class
public class HotelApp {
    public static void main(String[] args) {
        Hotel h = new Hotel();

        h.addRoom(new StandardRoom(101));
        h.addRoom(new DeluxeRoom(201));

        Guest g = new Guest(1, "Naman");

        try {
            Reservation r = h.book("Deluxe", g, 3);

            PricingStrategy ps = new SeasonalPricing();
            double bill = h.checkout(r, ps);

            System.out.println("Guest: " + g.name);
            System.out.println("Room: " + r.room.getType());
            System.out.println("Bill Amount: ₹" + bill);

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
