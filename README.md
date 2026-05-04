# 🎓 Student Early Warning System for Academic Risk Detection

A web-based system designed to help higher education institutions identify students who may be at risk of poor academic performance by monitoring academic indicators such as attendance and assessment results.

---

## Table of Contents
- [Project Overview](#project-overview)
- [Project Domain](#project-domain)
- [Problem Statement](#problem-statement)
- [System Users](#system-users)
- [Core System Features](#core-system-features)
- [System Architecture Overview](#system-architecture-overview)
- [System Workflow](#system-workflow)
- [Individual Project Scope](#individual-project-scope)
- [System Documentation](#system-documentation)
- [Repository Structure](#repository-structure)
- [Future Improvements](#future-improvements)
- [UML diagrams](#UML-diagrams)
- [Author](#author)

---

## Project Overview
The **Student Early Warning System** is a web-based academic monitoring platform designed to assist educational institutions in identifying students who may be at risk of academic failure. The system analyzes academic indicators such as attendance records and assessment results to detect early warning signs of academic difficulty.

By identifying at-risk students early, lecturers and academic advisors can provide timely academic support and interventions. This proactive approach helps improve student retention, academic success, and overall institutional performance.

---

## Project Domain
**Higher Education / Academic Performance Monitoring Systems**

The system operates within the higher education environment where institutions need effective tools to monitor student academic progress. Universities often manage large numbers of students, making manual monitoring of academic performance difficult and time-consuming. This system provides a centralized platform that allows academic staff to monitor student performance and quickly identify students who may require additional support.

---

## Problem Statement
In many higher education institutions, students who experience academic difficulties are often identified too late, usually after poor assessment results or near the end of the academic term. This delayed identification limits the effectiveness of academic support interventions and increases the likelihood of student failure or dropout.

Manual monitoring of student performance is often inefficient and prone to oversight, particularly in large classes. The **Student Early Warning System** addresses this issue by automatically monitoring key academic indicators such as attendance and assessment performance to detect early signs of academic risk and notify relevant academic staff.

---

## System Users
The system is designed to support multiple users within the academic environment.

### Students
- View their academic performance status
- Receive notifications if they are identified as at-risk

### Lecturers
- Record student attendance
- Upload assessment results
- View dashboards displaying student performance and risk indicators

### Academic Advisors
- Monitor students flagged as at-risk
- Provide academic guidance and intervention strategies

---

## Core System Features
The proposed system will include the following key features:

- User authentication and login system
- Student record management
- Attendance tracking and monitoring
- Assessment and grade recording
- Academic performance monitoring
- Automated detection of at-risk students based on predefined rules
- Dashboard for lecturers and academic advisors to monitor student progress
- Alert notifications for students identified as at-risk

---

## System Architecture Overview
The system follows a simple **web-based architecture** consisting of the following components:

- **Web Frontend:** User interface accessed by lecturers, students, and academic advisors through a web browser
- **Backend Application Server:** Handles system logic, data processing, and risk analysis
- **Risk Detection Module:** Evaluates academic indicators to identify at-risk students
- **Database:** Stores student information, attendance records, and assessment results
- **Notification Service:** Generates alerts for flagged students

---

## System Workflow
The system workflow illustrates how the components interact to detect and manage academic risks.

1. Lecturers log into the system.
2. Lecturers record student attendance and assessment results.
3. The system stores academic data in the database.
4. The risk detection module analyzes attendance and assessment data.
5. Students meeting predefined risk conditions are flagged as at-risk.
6. Lecturers and academic advisors view flagged students through a monitoring dashboard.
7. Academic support interventions can then be initiated.

---

## Individual Project Scope
This project focuses on the **design and documentation of a simplified Student Early Warning System** that can be developed and managed by a single developer.

The system will monitor academic indicators such as attendance and assessment results and identify at-risk students using predefined threshold rules. It will provide dashboards for lecturers and academic advisors to review student performance and risk alerts.

The project will **not include** the following advanced features:

- Complex machine learning prediction models
- Integration with existing university enterprise systems
- Mobile applications
- Real-time large-scale analytics pipelines

Limiting the scope ensures that the system remains feasible for an individual developer while still demonstrating a complete end-to-end system design.

---

## System Documentation
Detailed project documentation is available in the following files:

- **System Specification:**  
  [SPECIFICATION.md](SPECIFICATION.md)

- **System Architecture and C4 Diagrams:**  
  [ARCHITECTURE.md](ARCHITECTURE.md)

---

## Repository Structure
student-early-warning-system
│
├── README.md
├── SPECIFICATION.md
├── ARCHITECTURE.md
│
└── docs
     └── diagrams
          ├── context-diagram.png
          ├── container-diagram.png
          └── component-diagram.png

---

## Future Improvements
Potential future enhancements for the system may include:

- Machine learning-based academic risk prediction
- Integration with Learning Management Systems (LMS)
- Mobile application support
- Real-time academic analytics dashboards
- SMS and email notification services

---

## Github Part

## Kanban Board Customization

The GitHub Kanban board was customized to support Agile workflow management for the Student Early Warning System.

### Custom Columns

Two additional columns were added:

- **Testing**  
  This column represents tasks that have been completed and are undergoing verification before being marked as done. It aligns with quality assurance (QA) practices in software development.

- **Blocked**  
  This column is used to track tasks that cannot proceed due to dependencies or issues. It helps identify bottlenecks in the workflow and ensures transparency.

### Task Organization

User stories created in Assignment 6 were added to the Kanban board as GitHub Issues. These issues were categorized into different stages of development:

- **To Do:** Tasks ready to be started  
- **In Progress:** Tasks currently being worked on  
- **Testing:** Tasks under verification  
- **Done:** Completed tasks  
- **Blocked:** Tasks facing issues  

### Labels and Assignments

Each issue was labeled to indicate:
- Priority (e.g., high-priority)
- Type (e.g., feature, system)
- Area (e.g., frontend, backend)

Tasks were assigned using @mentions to simulate team responsibility, even though the project is completed individually.

### Agile Alignment

The Kanban board supports Agile principles by:
- Providing visual workflow tracking
- Limiting work-in-progress
- Enabling continuous task movement
- Improving transparency and organization

Overall, the customized Kanban board enhances task management and reflects real-world Agile development practices.


## Assignment 8: Object and Workflow Modeling

This section contains the UML diagrams used to model system behavior and workflows.

### State Transition Diagrams
- [View State Diagrams](STATE_DIAGRAMS.md)

These diagrams model how key system objects change over time based on events and conditions.

---

### Activity Diagrams
- [View Activity Diagrams](ACTIVITY_DIAGRAMS.md)

These diagrams represent system workflows, including decision points, parallel processes, and actor responsibilities.

---

### Traceability

All diagrams are mapped to:

- Functional Requirements (Assignment 4)
- User Stories and Sprint Tasks (Assignment 6)

This ensures consistency across system analysis, design, and Agile planning.

## Assignment 10

### Language Choice
Java was selected due to its strong support for object-oriented programming and design patterns.

### Creational Patterns Implemented

- Simple Factory → User creation
- Factory Method → Notification system
- Abstract Factory → UI components
- Builder → Report construction
- Prototype → Alert cloning
- Singleton → Database connection

These patterns demonstrate different approaches to object creation.

## Author
**Sinothando Masiki**  

