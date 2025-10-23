import types.RoomStatus;

public class Room {
    private int number;
    private RoomStatus status; // FREE, OCCUPIED, REPAIR, SERVICE
    private double price;
    private String guest;

    public Room(int number, double price) {
        this.number = number;
        this.price = price;
        this.status = RoomStatus.FREE;
        this.guest = null;
    }

    public int getNumber() { return number; }
    public RoomStatus getStatus() { return status; }
    public double getPrice() { return price; }
    public String getGuest() { return guest; }

    public void setStatus(RoomStatus status) { this.status = status; }
    public void setPrice(double price) { this.price = price; }
    public void setGuest(String guest) { this.guest = guest; }
    public void removeGuest() { this.guest = null; }
}
