package model;

public class Alert {
    private String alertId;
    private String message;
    private String status;

    public Alert(String alertId, String message, String status) {
        this.alertId = alertId;
        this.message = message;
        this.status = status;
    }

    public String generateAlert() {
        return "Alert generated: " + message;
    }

    public void sendAlert() {
        System.out.println("Alert sent: " + message);
    }

    public void closeAlert() {
        this.status = "Closed";
    }

    // Getters
    public String getAlertId() { return alertId; }
    public String getStatus() { return status; }
}