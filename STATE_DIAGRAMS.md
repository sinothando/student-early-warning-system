# State Transition Diagrams
## Student Early Warning System

---

## 1. Student State Diagram

```mermaid
stateDiagram-v2
    [*] --> Registered
    Registered --> Active: Student account activated
    Active --> AtRisk: Attendance < 70% or Grade < 50%
    AtRisk --> Supported: Advisor intervention recorded
    Supported --> Improved: Academic performance improves
    Improved --> Active: Risk cleared
    Active --> Inactive: Student account deactivated
    Inactive --> Active: Student account reactivated
```


Explanation

Key States

Registered
Active
AtRisk
Supported
Improved

Key Transitions

Registered → Active: student account activated
Active → AtRisk: attendance < 70% or grade < 50%
AtRisk → Supported: advisor intervention recorded
Supported → Improved: performance improves
Improved → Active: risk cleared

Mapping to Functional Requirements

FR5: Risk Detection
FR9: Advisor Monitoring
FR8: Student View Access

```mermaid
stateDiagram-v2
    [*] --> Created
    Created --> PendingReview: Attendance submitted
    PendingReview --> Validated: Lecturer confirms record
    PendingReview --> Rejected: Attendance incomplete or incorrect
    Rejected --> PendingReview: Attendance corrected and resubmitted
    Validated --> Archived: End of academic period
```


```mermaid
    stateDiagram-v2
    [*] --> Draft
    Draft --> Submitted: Grades uploaded
    Submitted --> Approved: Grades verified
    Submitted --> Rejected: Invalid or incomplete grades
    Rejected --> Draft: Corrections required
    Approved --> Archived: Finalized and stored
```


```mermaid
stateDiagram-v2
    [*] --> Normal
    Normal --> UnderReview: New attendance or grade data received
    UnderReview --> AtRisk: Attendance < 70% or Grade < 50%
    UnderReview --> Normal: Thresholds satisfied
    AtRisk --> Critical: Continued decline in performance
    AtRisk --> Monitored: Advisor starts support process
    Monitored --> Resolved: Performance improves
    Critical --> Monitored: Intervention initiated
    Resolved --> Normal: Student stabilizes academically
```


```mermaid
stateDiagram-v2
    [*] --> Generated
    Generated --> Sent: Alert delivered to dashboard
    Sent --> Acknowledged: Lecturer or advisor views alert
    Acknowledged --> Actioned: Intervention or follow-up started
    Sent --> Expired: No response within defined period
    Actioned --> Closed: Issue handled
    Expired --> Closed: Alert no longer active
```


```mermaid
stateDiagram-v2
    [*] --> Created
    Created --> Active: First successful login
    Active --> Locked: Multiple failed login attempts
    Locked --> Active: Admin unlocks account
    Active --> Suspended: Access temporarily revoked
    Suspended --> Active: Access restored
    Active --> Disabled: Account permanently disabled
```


```mermaid
stateDiagram-v2
    [*] --> Planned
    Planned --> Assigned: Advisor assigned
    Assigned --> InProgress: Support session started
    InProgress --> Completed: Intervention finished
    InProgress --> Escalated: Student needs additional support
    Escalated --> Completed: Additional support provided
    Completed --> Reviewed: Outcome evaluated
```