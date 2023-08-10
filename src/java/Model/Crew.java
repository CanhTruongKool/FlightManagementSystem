package Model;

public class Crew {
    private int ID;
    private String Name;
    private String PhoneNumber;
    private String Position;

    public Crew() {
    }

    public Crew(int iD, String name, String phoneNumber, String position) {
        ID = iD;
        Name = name;
        PhoneNumber = phoneNumber;
        Position = position;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

}
