package Model;


public class Revenue {
    private float revenueTicket;
    private float revenueCargo;
    private float totalRevenue;
    
    public Revenue() {
    }

    public Revenue(float revenueTicket, float revenueCargo) {
        this.revenueTicket = revenueTicket;
        this.revenueCargo = revenueCargo;
        this.totalRevenue = revenueCargo + revenueTicket;
    }

    public float getRevenueTicket() {
        return revenueTicket;
    }

    public void setRevenueTicket(float revenueTicket) {
        this.revenueTicket = revenueTicket;
    }

    public float getRevenueCargo() {
        return revenueCargo;
    }

    public void setRevenueCargo(float revenueCargo) {
        this.revenueCargo = revenueCargo;
    }

    public float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
 
}
