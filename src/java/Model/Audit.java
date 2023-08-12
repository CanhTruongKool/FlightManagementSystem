package Model;

import java.time.LocalDateTime;

public class Audit {
    private int CreatedBy;
    private LocalDateTime CreatedTime;
    private int ModifiedBy;
    private LocalDateTime LastModifiedTime;
    private int IsActivity;

    public Audit() {
    }

    public Audit(int createdBy, LocalDateTime createdTime, int modifiedBy, LocalDateTime lastModifiedTime,
            int isActivity) {
        CreatedBy = createdBy;
        CreatedTime = createdTime;
        ModifiedBy = modifiedBy;
        LastModifiedTime = lastModifiedTime;
        IsActivity = isActivity;
    }

    public int getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(int createdBy) {
        CreatedBy = createdBy;
    }

    public LocalDateTime getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        CreatedTime = createdTime;
    }

    public int getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public LocalDateTime getLastModifiedTime() {
        return LastModifiedTime;
    }

    public void setLastModifiedTime(LocalDateTime lastModifiedTime) {
        LastModifiedTime = lastModifiedTime;
    }

    public int getIsActivity() {
        return IsActivity;
    }

    public void setIsActivity(int isActivity) {
        IsActivity = isActivity;
    }
}
