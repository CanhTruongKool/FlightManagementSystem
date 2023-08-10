package Controller.DTOS;

public class SessionDTO {
    private int UserID;
    private String UserName;
    private String SessionID;

    public SessionDTO(int userID, String userName, String sessionID) {
        UserID = userID;
        UserName = userName;
        SessionID = sessionID;
    }

    public int getUserID() {
        return UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public String getSessionID() {
        return SessionID;
    }
}
