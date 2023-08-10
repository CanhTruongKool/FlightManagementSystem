package Model;

import java.time.LocalDateTime;

public class FlightCrew extends Audit {
    private int FlightID;
    private int crewID;

    public FlightCrew() {
    }

    public FlightCrew(int createdBy, LocalDateTime createdTime, int modifiedBy, LocalDateTime lastModifiedTime,
            int isActivity, int flightID, int crewIDs) {
        super(createdBy, createdTime, modifiedBy, lastModifiedTime, isActivity);
        FlightID = flightID;
        this.crewID = crewIDs;
    }

    public int getFlightID() {
        return FlightID;
    }

    public void setFlightID(int flightID) {
        FlightID = flightID;
    }

    public int getCrewID() {
        return crewID;
    }

    public void setCrewID(int crewID) {
        this.crewID = crewID;
    }
}
