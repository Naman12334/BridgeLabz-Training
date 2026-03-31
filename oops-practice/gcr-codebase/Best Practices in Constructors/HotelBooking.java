class HotelBooking {
    String guest;
    String room;
    int nights;

    HotelBooking() {
        guest = "NA";
        room = "Standard";
        nights = 1;
    }

    HotelBooking(String guest, String room, int nights) {
        this.guest = guest;
        this.room = room;
        this.nights = nights;
    }

    HotelBooking(HotelBooking h) {
        guest = h.guest;
        room = h.room;
        nights = h.nights;
    }
}
