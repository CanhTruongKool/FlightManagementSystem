package Model;

import java.time.LocalDateTime;

public class Flight extends Audit{
    private int ID;
    private String DeparturePlace,Destination;
    private LocalDateTime DepartureDate;
    private int NumberOfSeats,MaxCargoWeight;
    private float Price;
    
    public Flight() {
    }

    public Flight(int createdBy, LocalDateTime createdTime, int modifiedBy, LocalDateTime lastModifiedTime,
            int isActivity, int iD, String departurePlace, String destination, LocalDateTime departureDate,
            int numberOfSeats, int maxCargoWeight, float price) {
        super(createdBy, createdTime, modifiedBy, lastModifiedTime, isActivity);
        ID = iD;
        DeparturePlace = departurePlace;
        Destination = destination;
        DepartureDate = departureDate;
        NumberOfSeats = numberOfSeats;
        MaxCargoWeight = maxCargoWeight;
        Price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDeparturePlace() {
        return DeparturePlace;
    }

    public void setDeparturePlace(String DeparturePlace) {
        this.DeparturePlace = DeparturePlace;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public LocalDateTime getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(LocalDateTime DepartureDate) {
        this.DepartureDate = DepartureDate;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int NumberOfSeats) {
        this.NumberOfSeats = NumberOfSeats;
    }

    public int getMaxCargoWeight() {
        return MaxCargoWeight;
    }

    public void setMaxCargoWeight(int MaxCargoWeight) {
        this.MaxCargoWeight = MaxCargoWeight;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Flight{" + "ID=" + ID + ", DeparturePlace=" + DeparturePlace + ", Destination=" + Destination + ", DepartureDate=" + DepartureDate + ", NumberOfSeats=" + NumberOfSeats + ", MaxCargoWeight=" + MaxCargoWeight + ", Price=" + Price + '}';
    }
}
