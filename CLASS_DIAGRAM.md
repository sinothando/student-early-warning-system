# Class Diagram
## Student Early Warning System

---

```mermaid
classDiagram

class Student {
    -studentId: String
    -name: String
    -email: String
    -status: String
    +viewPerformance()
    +receiveAlert()
}

class AttendanceRecord {
    -attendanceId: String
    -date: Date
    -status: String
    +recordAttendance()
}

class GradeRecord {
    -gradeId: String
    -score: float
    -module: String
    +uploadGrade()
}

class RiskStatus {
    -riskLevel: String
    -evaluationDate: Date
    +evaluateRisk()
}

class Alert {
    -alertId: String
    -message: String
    -status: String
    +generateAlert()
    +sendAlert()
}

class UserAccount {
    -userId: String
    -username: String
    -password: String
    -role: String
    +login()
    +logout()
}

class InterventionRecord {
    -interventionId: String
    -description: String
    -outcome: String
    +recordIntervention()
}

Student "1" -- "0..*" AttendanceRecord : has
Student "1" -- "0..*" GradeRecord : has
Student "1" -- "1" RiskStatus : has
Student "1" -- "0..*" Alert : receives
Student "1" -- "0..*" InterventionRecord : receives
UserAccount "1" -- "0..*" InterventionRecord : manages