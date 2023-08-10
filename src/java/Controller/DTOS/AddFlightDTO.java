package Controller.DTOS;

import java.time.LocalDateTime;

public class AddFlightDTO {
    private String DeparturePlace;
    private LocalDateTime DepartureDate;
    private String Destination;
    private int NumberOfSeats;
    private int MaxCargoWeight;
    private long Price;

    public void setPrice(long price) {
        Price = price;
    }

    public long getPrice() {
        return Price;
    }

    public AddFlightDTO(String departurePlace, LocalDateTime departureDate, String destination, int numberOfSeats,
            int maxCargoWeight, long price) {
        DeparturePlace = departurePlace;
        DepartureDate = departureDate;
        Destination = destination;
        NumberOfSeats = numberOfSeats;
        MaxCargoWeight = maxCargoWeight;
        Price = price;
    }

    public AddFlightDTO() {
    }

    public String getDeparturePlace() {
        return DeparturePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        DeparturePlace = departurePlace;
    }

    public LocalDateTime getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        DepartureDate = departureDate;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getNumberOfSeats() {
        return NumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        NumberOfSeats = numberOfSeats;
    }

    public int getMaxCargoWeight() {
        return MaxCargoWeight;
    }

    public void setMaxCargoWeight(int maxCargoWeight) {
        MaxCargoWeight = maxCargoWeight;
    }
}
