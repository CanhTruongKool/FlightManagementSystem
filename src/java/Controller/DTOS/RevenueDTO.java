package Controller.DTOS;


public class RevenueDTO {
    private double revenueTicket;
    private double revenueCargo;
    private double totalRevenue;
    
    public RevenueDTO() {
    }

    public RevenueDTO(double revenueTicket, double revenueCargo) {
        this.revenueTicket = revenueTicket;
        this.revenueCargo = revenueCargo;
        this.totalRevenue = revenueCargo + revenueTicket;
    }

    public double getRevenueTicket() {
        return revenueTicket;
    }

    public void setRevenueTicket(double revenueTicket) {
        this.revenueTicket = revenueTicket;
    }

    public double getRevenueCargo() {
        return revenueCargo;
    }

    public void setRevenueCargo(double revenueCargo) {
        this.revenueCargo = revenueCargo;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
    

}