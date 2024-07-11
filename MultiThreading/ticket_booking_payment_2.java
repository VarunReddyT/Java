// In movie booking, prevent multiple users from booking the same seat
// Use synchronized method to prevent multiple users from booking the same seat

// ! Money also needs to be synchronized

public class ticket_booking_payment_2 implements Runnable{
    int total_seats = 43;
    int amount = 0;
    synchronized void book_ticket(int seats){
        if(total_seats >= seats){
            System.out.println("Booking " + seats + " seats");
            total_seats -= seats;
            double price = ((seats*100) + (0.08*(seats*100)));
            amount += price;
            System.out.println("Payment of " + price + " successful");
            System.out.println("Seats booked successfully");
        }
        else{
            System.out.println("Seats not available");
        }
    }   

    public void run(){
        book_ticket(5);
    }

    public static void main(String[] args) {
        ticket_booking_payment_2 b = new ticket_booking_payment_2();      
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);
        Thread t4 = new Thread(b);
        Thread t5 = new Thread(b);
        Thread t6 = new Thread(b);
        Thread t7 = new Thread(b);
        Thread t8 = new Thread(b);
        Thread t9 = new Thread(b);
        Thread t10 = new Thread(b);
        Thread t11 = new Thread(b);
        Thread t12 = new Thread(b);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
    }
}
