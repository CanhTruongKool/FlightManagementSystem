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
public class Ticket {
    private int FlightID,PassengerID;
    private String Code;

    public Ticket() {
    }

    public Ticket(int FlightID, int PassengerID, String Code) {
        this.FlightID = FlightID;
        this.PassengerID = PassengerID;
        this.Code = Code;
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

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }



    @Override
    public String toString() {
        return "Ticket{" + "FlightID=" + FlightID + ", PassengerID=" + PassengerID + ", Code=" + Code + '}';
    }
    
    
}

