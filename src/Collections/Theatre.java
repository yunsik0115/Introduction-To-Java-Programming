package Collections;

import java.util.*;

public class Theatre {
    private final String theatreName;
    // final -> needs to update constructor.

    // private List<Seat> seats = new ArrayList<>();
    // private List<Seat> seats = new LinkedList<>();
    // private Collection<Seat> seats = new LinkedList<>();
    private Collection<Seat> seats = new LinkedHashSet<>();
    // now it will be sorted in different order.
    // LinkedHashset will sort unsorted HashSet in order.


    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum < seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = null;
        for(Seat seat : seats){
            System.out.print("."); // How many Seats needs to be checked
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }
        }

        if(requestedSeat == null){
            System.out.println("There is no seat" + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }

    // for testing
    public void getSeats(){
        for(Seat seat : seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }
            else{
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved) {
                this.reserved = false;
                System.out.println("Seat " + seatNumber + " cancelled");
                return true;
            }
            else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }

}