# Domain Model
## Student Early Warning System

---

## Key Domain Entities

| Entity | Attributes | Responsibilities / Methods | Relationships |
|---|---|---|---|
| UserAccount | userId, username, email, passwordHash, role, accountStatus | login(), logout(), updateProfile() | Parent class for Student, Lecturer, AcademicAdvisor, SystemAdmin |
| Student | studentId, name, email, status | viewPerformance(), viewAlerts() | Has AttendanceRecords, GradeRecords, RiskStatus, Alerts, InterventionRecords |
| Lecturer | lecturerId, name, email, department | recordAttendance(), uploadGrades(), viewDashboard() | Creates AttendanceRecords and GradeRecords |
| AcademicAdvisor | advisorId, name, email | monitorStudent(), recordIntervention() | Manages InterventionRecords |
| AttendanceRecord | attendanceId, date, attendancePercentage, status | recordAttendance(), validateAttendance() | Belongs to one Student |
| GradeRecord | gradeId, moduleName, assessmentName, score, status | uploadGrade(), validateGrade() | Belongs to one Student |
| RiskStatus | riskId, riskLevel, evaluationDate, reason | evaluateRisk(), updateRiskLevel() | Belongs to one Student |
| Alert | alertId, message, alertStatus, createdDate | generateAlert(), acknowledgeAlert(), closeAlert() | Linked to Student and RiskStatus |
| InterventionRecord | interventionId, description, outcome, interventionDate | recordIntervention(), updateOutcome() | Linked to Student and AcademicAdvisor |

---

## Business Rules

1. A user must have a valid account before accessing the system.
2. A `UserAccount` can be specialized as a `Student`, `Lecturer`, `AcademicAdvisor`, or `SystemAdmin`.
3. A student is marked **At Risk** if attendance is below **70%** or average grade is below **50%**.
4. A student can have many attendance records.
5. A student can have many grade records.
6. Each attendance record belongs to exactly one student.
7. Each grade record belongs to exactly one student.
8. Each student must have one current risk status.
9. A risk status may generate one or more alerts.
10. An alert must be linked to a valid student and risk status.
11. Only lecturers can record attendance and upload grades.
12. Only academic advisors can record intervention actions.
13. A student may receive multiple interventions over time.
14. An intervention record must be linked to one student and one academic advisor.
15. Closed alerts must remain stored for audit and historical tracking.

---

## Design Notes

The domain model uses inheritance for different user roles because students, lecturers, advisors, and administrators all share common account details but perform different actions.

Composition is used between `Student` and records such as `AttendanceRecord`, `GradeRecord`, `RiskStatus`, and `InterventionRecord` because these records depend on the student’s academic profile.