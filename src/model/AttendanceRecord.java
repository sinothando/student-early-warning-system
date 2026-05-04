package model;

public class AttendanceRecord {
    private String attendanceId;
    private String date;
    private double percentage;

    public AttendanceRecord(String id, String date, double percentage) {
        this.attendanceId = id;
        this.date = date;
        this.percentage = percentage;
    }

    public String recordAttendance() {
        return "Attendance recorded";
    }
}