# System Requirements
## Student Early Warning System

---

## 1. Functional Requirements

### FR1: User Authentication
The system shall allow users to log in using secure credentials.

**Acceptance Criteria:**
- Users must enter valid username and password
- System must deny access for invalid credentials

---

### FR2: Student Record Management
The system shall store and manage student academic records.

---

### FR3: Attendance Recording
The system shall allow lecturers to record student attendance.

---

### FR4: Grade Management
The system shall allow lecturers to upload and update student grades.

---

### FR5: Risk Detection
The system shall analyze attendance and grades to identify at-risk students.

**Acceptance Criteria:**
- Students with attendance < 70% must be flagged
- Students with grades < 50% must be flagged

---

### FR6: Dashboard Display
The system shall display student performance and risk status on a dashboard.

---

### FR7: Alert Generation
The system shall generate alerts for at-risk students.

---

### FR8: Student View Access
The system shall allow students to view their academic performance.

---

### FR9: Advisor Monitoring
The system shall allow academic advisors to monitor flagged students.

---

### FR10: Data Storage
The system shall store all academic data in a database.

---


## 2. Non-Functional Requirements

### Usability
- The system shall provide a user-friendly interface
- The system shall be easy to navigate for all users

### Deployability
- The system shall be deployable on web browsers
- The system shall support Windows and Linux environments

### Maintainability
- The system shall have clear documentation for future updates
- The system shall allow easy modification of system components

### Scalability
- The system shall support up to 1000 concurrent users
- The system shall handle increasing student data efficiently

### Security
- The system shall require authentication for all users
- The system shall protect user data from unauthorized access

### Performance
- The system shall load dashboards within 2 seconds
- The system shall process data efficiently without delays