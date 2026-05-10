package model;

public class Student {
    private String studentId;
    private String name;
    private String status;

    public Student(String studentId, String name, String status) {
        this.studentId = studentId;
        this.name = name;
        this.status = status;
    }

    public String viewPerformance() {
        return name + " performance viewed";
    }

    public String viewAlerts() {
        return "Alerts displayed";
    }

    // Getters
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
}