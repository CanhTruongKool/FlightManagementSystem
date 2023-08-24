package Controller.DTOS;

import java.time.LocalDateTime;

public class FlightDTO {

    int ID;
    String departurePlace;
    String destination;
    LocalDateTime departureDate;
    int numberOfSeats;
    int maxCargoWeight;
    float price;
    String createdBy;
    LocalDateTime createdTime;
    String modifiedBy;
    LocalDateTime lastModifiedTime;
    int isActivity;

    public FlightDTO() {
    }

    public FlightDTO(int ID, String departurePlace, String destination, LocalDateTime departureDate, int numberOfSeats, 
            int maxCargoWeight, float price, String createdBy, LocalDateTime createdTime, String modifiedBy, LocalDateTime lastModifiedTime, int isActivity) {
        this.ID = ID;
        this.departurePlace = departurePlace;
        this.destination = destination;
        this.departureDate = departureDate;
        this.numberOfSeats = numberOfSeats;
        this.maxCargoWeight = maxCargoWeight;
        this.price = price;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.modifiedBy = modifiedBy;
        this.lastModifiedTime = lastModifiedTime;
        this.isActivity = isActivity;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public void setMaxCargoWeight(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(LocalDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public int getIsActivity() {
        return isActivity;
    }

    public void setIsActivity(int isActivity) {
        this.isActivity = isActivity;
    }
    
}
