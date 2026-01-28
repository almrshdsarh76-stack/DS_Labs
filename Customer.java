public class Customer {
    private String name;
    private int ticketNumber;

    public Customer(String name, int ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        return "عميل رقم [" + ticketNumber + "] واسمه: " + name;
    }
}