package services;

import model.AttendanceRecord;

import java.util.ArrayList;
import java.util.List;

public class AttendanceService {

    private final List<AttendanceRecord> records = new ArrayList<>();

    public void addAttendance(AttendanceRecord record) {

        if (record == null) {
            throw new IllegalArgumentException("Attendance record cannot be null");
        }

        records.add(record);
    }

    public List<AttendanceRecord> getAllAttendance() {
        return records;
    }
}