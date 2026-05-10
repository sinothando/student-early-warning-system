package model;

public class RiskStatus {
    private String riskLevel;
    private String evaluationDate;
    private String reason;

    public RiskStatus(String riskLevel, String evaluationDate, String reason) {
        this.riskLevel = riskLevel;
        this.evaluationDate = evaluationDate;
        this.reason = reason;
    }

    public String evaluateRisk() {
        return "Risk evaluated: " + riskLevel;
    }

    public void updateRiskLevel(String newLevel) {
        this.riskLevel = newLevel;
    }

    // Getters
    public String getRiskLevel() { return riskLevel; }
}