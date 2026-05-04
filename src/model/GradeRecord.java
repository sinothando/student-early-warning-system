package model;

public class GradeRecord {
    private String gradeId;
    private String moduleName;
    private String assessmentName;
    private double score;

    public GradeRecord(String gradeId, String moduleName, String assessmentName, double score) {
        this.gradeId = gradeId;
        this.moduleName = moduleName;
        this.assessmentName = assessmentName;
        this.score = score;
    }

    public String uploadGrade() {
        return "Grade uploaded";
    }

    // Getters
    public String getGradeId() { return gradeId; }
    public double getScore() { return score; }
}
