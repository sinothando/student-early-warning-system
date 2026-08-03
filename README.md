# 🎓 Student Early Warning System (SEWS)

A web-based system that helps higher education institutions identify students at risk of poor academic performance by monitoring indicators such as attendance and assessment results.

---

## Table of Contents

- [Overview](#overview)
- [Problem Statement](#problem-statement)
- [System Users](#system-users)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [System Architecture](#system-architecture)
- [System Workflow](#system-workflow)
- [Project Scope](#project-scope)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Running the Application](#running-the-application)
    - [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [API Documentation](#api-documentation)
- [Design Patterns](#design-patterns)
- [CI/CD Pipeline](#cicd-pipeline)
- [Branch Protection](#branch-protection)
- [Project Documentation](#project-documentation)
- [Agile & Kanban Workflow](#agile--kanban-workflow)
- [Future Improvements](#future-improvements)
- [Contribution Guidelines](#contribution-guidelines)
- [Project Roadmap](#project-roadmap)
- [License](#license)
- [Author](#author)

---

## Overview

The **Student Early Warning System (SEWS)** is a Spring Boot application designed to help educational institutions identify and monitor at-risk students. It analyzes academic indicators — attendance records and assessment results — to detect early warning signs of academic difficulty, so lecturers and academic advisors can step in with timely support.

By identifying at-risk students early, this proactive approach helps improve student retention, academic success, and overall institutional performance.

**Domain:** Higher Education / Academic Performance Monitoring

---

## Problem Statement

In many institutions, students experiencing academic difficulties are identified too late — usually after poor assessment results or near the end of the term. This delayed identification limits the effectiveness of academic interventions and increases the risk of failure or dropout.

Manual monitoring is inefficient and prone to oversight, especially in large classes. SEWS addresses this by automatically tracking attendance and assessment performance to flag early signs of risk and notify the relevant staff.

---

## System Users

**Students**
- View their academic performance status
- Receive notifications if flagged as at-risk

**Lecturers**
- Record student attendance
- Upload assessment results
- View dashboards of student performance and risk indicators

**Academic Advisors**
- Monitor students flagged as at-risk
- Provide guidance and intervention strategies

---

## Features

- User authentication and login system
- Student record management
- Attendance tracking and monitoring
- Assessment and grade recording
- Automated detection of at-risk students based on predefined rules
- Dashboards for lecturers and academic advisors
- Alert notifications for at-risk students
- REST API with OpenAPI/Swagger documentation
- Repository pattern implementation
- CI/CD with GitHub Actions

---

## Technologies Used

| Category   | Technology         |
|------------|---------------------|
| Language   | Java 21              |
| Framework  | Spring Boot 3        |
| Build Tool | Maven 3.9+           |
| Testing    | JUnit 5              |
| API Docs   | Swagger / OpenAPI    |
| CI/CD      | GitHub Actions       |

---

## System Architecture

SEWS follows a simple web-based architecture made up of:

- **Web Frontend** — UI accessed by lecturers, students, and advisors via a browser
- **Backend Application Server** — handles system logic, data processing, and risk analysis
- **Risk Detection Module** — evaluates academic indicators to identify at-risk students
- **Database** — stores student information, attendance records, and assessment results
- **Notification Service** — generates alerts for flagged students

Detailed diagrams: see [System Documentation](#project-documentation).

---

## System Workflow

1. Lecturers log into the system.
2. Lecturers record student attendance and assessment results.
3. The system stores academic data in the database.
4. The risk detection module analyzes attendance and assessment data.
5. Students meeting predefined risk conditions are flagged as at-risk.
6. Lecturers and academic advisors view flagged students on a monitoring dashboard.
7. Academic support interventions are initiated.

---

## Project Scope

This project focuses on the **design and implementation of a simplified SEWS**, feasible for a single developer while still demonstrating a complete end-to-end system.

**In scope:** attendance/assessment monitoring, threshold-based risk detection, dashboards for lecturers and advisors.

**Out of scope:**
- Complex machine learning prediction models
- Integration with existing university enterprise systems
- Mobile applications
- Real-time large-scale analytics pipelines

---

## Getting Started

### Prerequisites

- Java 21+
- Maven 3.9+
- Git
- VS Code or IntelliJ IDEA

### Installation

Clone the repository:
```bash
git clone https://github.com/YOUR-USERNAME/student-early-warning-system.git
cd student-early-warning-system
```

Build the project:
```bash
mvn clean install
```

### Running the Application

```bash
mvn spring-boot:run
```

The application will be available at:
```
http://localhost:8080
```

### Running Tests

Run all tests:
```bash
mvn test
```

Build a packaged JAR:
```bash
mvn clean package
```

---

## Project Structure

```
student-early-warning-system/
│
├── README.md
├── SPECIFICATION.md
├── ARCHITECTURE.md
├── pom.xml
│
├── docs/
│   ├── openapi.yaml
│   └── diagrams/
│       ├── context-diagram.png
│       ├── container-diagram.png
│       ├── component-diagram.png
│       ├── swagger-screenshot.png
│       └── github-project-board.png
│
└── src/
    ├── main/
    │   ├── java/
    │   │   ├── api/              # REST controllers
    │   │   ├── model/            # Domain entities
    │   │   ├── repositories/     # Data access layer
    │   │   ├── services/         # Business logic
    │   │   ├── factories/        # Object-creation factories
    │   │   └── creational_patterns/
    │   └── resources/
    └── test/
        └── java/
```

---

## API Documentation

The REST API is documented using OpenAPI/Swagger.

- **Swagger UI:** run the application and open `http://localhost:8080/swagger-ui/index.html`
- **OpenAPI spec:** [docs/openapi.yaml](docs/openapi.yaml)

**Capabilities:**
- Student CRUD operations
- RESTful endpoints
- JSON request/response handling
- Error response handling

---

## Design Patterns

Java was chosen for its strong support for object-oriented design. SEWS demonstrates the six creational patterns:

| Pattern          | Applied To                |
|------------------|----------------------------|
| Simple Factory   | User creation              |
| Factory Method   | Notification system        |
| Abstract Factory | UI components               |
| Builder          | Report construction        |
| Prototype        | Alert cloning               |
| Singleton        | Database connection         |

---

## CI/CD Pipeline

GitHub Actions automatically:

1. Runs tests on every push and on pull requests.
2. Prevents merging when tests fail.
3. Builds a JAR artifact when changes are merged into `main`.
4. Uploads the artifact as a build output.

Workflow file: `.github/workflows/ci.yml`

To run the same tests locally:
```bash
mvn test
```

---

## Branch Protection

The `main` branch is protected using:
- Required pull request reviews
- Required status checks
- Restricted direct pushes

This ensures all code changes are reviewed and tested before merging.

---

## Project Documentation

- **System Specification:** [SPECIFICATION.md](SPECIFICATION.md)
- **System Architecture & C4 Diagrams:** [ARCHITECTURE.md](ARCHITECTURE.md)
- **State Transition Diagrams:** [STATE_DIAGRAMS.md](STATE_DIAGRAMS.md)
- **Activity Diagrams:** [ACTIVITY_DIAGRAMS.md](ACTIVITY_DIAGRAMS.md)

All diagrams are traceable to the Functional Requirements and to the User Stories/Sprint Tasks, keeping system analysis, design, and Agile planning consistent.

---

## Agile & Kanban Workflow

The GitHub Kanban board was customized to support Agile workflow management:

**Custom columns:**
- **Testing** — completed tasks undergoing verification (QA)
- **Blocked** — tasks stalled by dependencies or issues, surfacing bottlenecks

**Full column set:** To Do → In Progress → Testing → Done, with Blocked as needed.

**Labels** capture priority (e.g. high-priority), type (e.g. feature, system), and area (e.g. frontend, backend). Tasks are assigned via @mentions to simulate team responsibility, even though the project is completed individually.

This supports Agile principles: visual workflow tracking, limited work-in-progress, continuous task movement, and transparency.

---

## Future Improvements

- Machine learning-based academic risk prediction
- Integration with Learning Management Systems (LMS)
- Mobile application support
- Real-time academic analytics dashboards
- SMS and email notification services

---

## Contribution Guidelines

See [CONTRIBUTING.md](CONTRIBUTING.md) for information on contributing to this project.

---

## Project Roadmap

Future enhancements are documented in [ROADMAP.md](ROADMAP.md).

---

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

---

## Author

**Sinothando Masiki**