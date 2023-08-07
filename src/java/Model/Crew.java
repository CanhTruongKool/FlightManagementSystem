/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Administrator
 */
public class Cargo {
    private int FlightID, PassengerID;
    private String Category;
    private float Weight, Price;

    public Cargo() {
    }

    public Cargo(int FlightID, int PassengerID, String Category, float Weight, float Price) {
        this.FlightID = FlightID;
        this.PassengerID = PassengerID;
        this.Category = Category;
        this.Weight = Weight;
        this.Price = Price;
    }

    public int getFlightID() {
        return FlightID;
    }

    public void setFlightID(int FlightID) {
        this.FlightID = FlightID;
    }

    public int getPassengerID() {
        return PassengerID;
    }

    public void setPassengerID(int PassengerID) {
        this.PassengerID = PassengerID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float Weight) {
        this.Weight = Weight;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Cargo{" + "FlightID=" + FlightID + ", PassengerID=" + PassengerID + ", Category=" + Category + ", Weight=" + Weight + ", Price=" + Price + '}';
    }
    
    
}
