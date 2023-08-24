package Controller.DTOS;

import java.time.LocalDateTime;

public class PassengerDTO {

    private int passengerID;
    private String name;
    private String phoneNumber;
    private String identifyNumber;
    private String ticketCode;
    private LocalDateTime buyTime;
    private LocalDateTime modifiedTime;
    private int status;

    public PassengerDTO() {
    }

    public PassengerDTO(int passengerID, String name, String phoneNumber, String identifyNumber,
            String ticketCode, LocalDateTime buyTime, LocalDateTime modifiedTime, int status) {
        this.passengerID = passengerID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.identifyNumber = identifyNumber;
        this.ticketCode = ticketCode;
        this.buyTime = buyTime;
        this.modifiedTime = modifiedTime;
        this.status = status;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identityNumber) {
        this.identifyNumber = identityNumber;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public LocalDateTime getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(LocalDateTime buyTime) {
        this.buyTime = buyTime;
    }

    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
