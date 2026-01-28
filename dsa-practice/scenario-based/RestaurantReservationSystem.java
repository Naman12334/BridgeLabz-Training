import java.util.*;


class TableAlreadyReservedException extends Exception {
    public TableAlreadyReservedException(String message) {
        super(message);
    }
}

class Table {
    private int tableNumber;
    private int capacity;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }
}


class Reservation {
    private int tableNumber;
    private String timeSlot;

    public Reservation(int tableNumber, String timeSlot) {
        this.tableNumber = tableNumber;
        this.timeSlot = timeSlot;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getTimeSlot() {
        return timeSlot;
    }
}


class ReservationSystem {

    private Map<Integer, Table> tableMap = new HashMap<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addTable(Table table) {
        tableMap.put(table.getTableNumber(), table);
    }

    public void reserveTable(int tableNumber, String timeSlot)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.getTableNumber() == tableNumber &&
                r.getTimeSlot().equals(timeSlot)) {
                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " already reserved for " + timeSlot);
            }
        }

        reservations.add(new Reservation(tableNumber, timeSlot));
        System.out.println("✅ Table " + tableNumber + " reserved for " + timeSlot);
    }

    public void cancelReservation(int tableNumber, String timeSlot) {
        reservations.removeIf(r ->
                r.getTableNumber() == tableNumber &&
                r.getTimeSlot().equals(timeSlot));
        System.out.println("❌ Reservation cancelled");
    }

    public void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for " + timeSlot + ":");
        for (Table table : tableMap.values()) {
            boolean reserved = false;
            for (Reservation r : reservations) {
                if (r.getTableNumber() == table.getTableNumber() &&
                    r.getTimeSlot().equals(timeSlot)) {
                    reserved = true;
                    break;
                }
            }
            if (!reserved) {
                System.out.println("Table " + table.getTableNumber());
            }
        }
    }
}


public class RestaurantReservationSystem {
    public static void main(String[] args) {

        ReservationSystem system = new ReservationSystem();

        system.addTable(new Table(1, 4));
        system.addTable(new Table(2, 2));
        system.addTable(new Table(3, 6));

        try {
            system.reserveTable(1, "6PM-8PM");
            system.reserveTable(2, "6PM-8PM");
            system.reserveTable(1, "6PM-8PM"); 
            System.out.println("⚠️ " + e.getMessage());
        }

        system.showAvailableTables("6PM-8PM");
        system.cancelReservation(2, "6PM-8PM");
        system.showAvailableTables("6PM-8PM");
    }
}
