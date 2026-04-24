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


Explanation

The class diagram represents the structure of the Student Early Warning System.

Key Design Decisions
The Student class is central and connected to most entities.
AttendanceRecord and GradeRecord are separate classes to maintain modularity.
RiskStatus is modeled as a separate class to isolate risk evaluation logic.
Alert is used to notify users about risk conditions.
InterventionRecord captures support actions taken by advisors.
Relationships
One student can have many attendance and grade records.
Each student has one risk status.
Alerts and interventions are linked to students.
UserAccount represents system users such as lecturers and advisors.
Alignment with Previous Assignments
Matches Assignment 4 (requirements): risk detection, alerts, dashboard
Matches Assignment 6 (user stories): monitoring, intervention
Matches Assignment 8 (state/activity diagrams): behavior and workflows