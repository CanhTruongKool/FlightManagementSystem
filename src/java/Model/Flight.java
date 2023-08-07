/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author Administrator
 */
public class Flight {
    private String ID, DeparturePlace,Destination;
    private LocalDateTime DepartureDate;
    private int NumberOfSeats,MaxCargoWeight;
    private float Price;
    
    public Flight() {
    }

    public Flight(String ID, String DeparturePlace, String Destination, LocalDateTime DepartureDate, int NumberOfSeats, int MaxCargoWeight, float Price) {
        this.ID = ID;
        this.DeparturePlace = DeparturePlace;
        this.Destination = Destination;
        this.DepartureDate = DepartureDate;
        this.NumberOfSeats = NumberOfSeats;
        this.MaxCargoWeight = MaxCargoWeight;
        this.Price = Price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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
