# Domain Model
## Student Early Warning System

---

## Entities and Their Definitions

| Entity | Attributes | Methods | Relationships |
|--------|------------|---------|---------------|
| Student | studentId, name, email, status | viewPerformance(), receiveAlert() | Linked to Attendance, Grades, RiskStatus |
| AttendanceRecord | attendanceId, date, status | recordAttendance() | Belongs to Student |
| GradeRecord | gradeId, score, module | uploadGrade() | Belongs to Student |
| RiskStatus | riskLevel, evaluationDate | evaluateRisk() | Linked to Student |
| Alert | alertId, message, status | generateAlert(), sendAlert() | Linked to Student and Advisor |
| UserAccount | userId, username, password, role | login(), logout() | Represents system users |
| InterventionRecord | interventionId, description, outcome | recordIntervention() | Linked to Student and Advisor |

---

## Relationships

- A **Student** has many AttendanceRecords (1..*)
- A **Student** has many GradeRecords (1..*)
- A **Student** has one RiskStatus (1..1)
- A **Student** can have many Alerts (1..*)
- An **Advisor** (UserAccount) manages many InterventionRecords (1..*)
- An **InterventionRecord** belongs to one Student (1..1)

---

## Business Rules

- A student is marked **At Risk** if:
  - Attendance < 70% OR
  - Grade < 50%

- A student can have **multiple alerts**, but each alert must be linked to a valid risk condition.

- Only authorized users (lecturers/advisors) can:
  - Record attendance
  - Upload grades
  - Provide interventions

- Each intervention must be recorded and linked to a specific student.

- A user must log in before accessing the system.

---

## Summary

The domain model defines the core entities and their relationships in the system. It ensures that system functionality aligns with requirements, user stories, and previously designed diagrams.