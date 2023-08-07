
package Model;

public class Passenger {
    private String Name,PhoneNumber,IdentityNumber;

    public Passenger() {
    }

    public Passenger(String Name, String PhoneNumber, String IdentityNumber) {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.IdentityNumber = IdentityNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getIdentityNumber() {
        return IdentityNumber;
    }

    public void setIdentityNumber(String IdentityNumber) {
        this.IdentityNumber = IdentityNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" + "Name=" + Name + ", PhoneNumber=" + PhoneNumber + ", IdentityNumber=" + IdentityNumber + '}';
    }
    
    
}
