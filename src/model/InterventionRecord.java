package model;

public class InterventionRecord {
    private String interventionId;
    private String description;
    private String outcome;

    public InterventionRecord(String interventionId, String description, String outcome) {
        this.interventionId = interventionId;
        this.description = description;
        this.outcome = outcome;
    }

    public String recordIntervention() {
        return "Intervention recorded";
    }

    public void updateOutcome(String newOutcome) {
        this.outcome = newOutcome;
    }

    // Getters
    public String getInterventionId() { return interventionId; }
    public String getOutcome() { return outcome; }
}
