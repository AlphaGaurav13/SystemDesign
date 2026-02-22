class TicketBooking {
    private final Object booking  = new Object();

    private Map<String, String> seatowners = new HashMap<>();

    public boolean bookSeat(String seatId, String visitorId){
        synchronized(bookingLock) {
            if(seatOwners.containsKey(seatId)) {
                return false;
            }

            seatOwners.put(seatId, )
        }
    } 
}