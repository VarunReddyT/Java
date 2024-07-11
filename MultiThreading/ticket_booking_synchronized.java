// In movie booking, prevent multiple users from booking the same seat
// Use synchronized method to prevent multiple users from booking the same seat

// ! Money also needs to be synchronized

public class ticket_booking_synchronized extends Thread{
    int total_seats = 9;
    synchronized void book_ticket(int seats){
        if(total_seats >= seats){
            System.out.println("Booking " + seats + " seats");
            total_seats -= seats;
            System.out.println("Seats booked successfully");
        }
        else{
            System.out.println("Seats not available");
        }
    }

    public static void main(String[] args) {
        ticket_booking_synchronized b = new ticket_booking_synchronized();
        Thread t1 = new Thread(){
            public void run(){
                b.book_ticket(5);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                b.book_ticket(5);
            }
        };
        t1.start();
        t2.start();
    }
}
