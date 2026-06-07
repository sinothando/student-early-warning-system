# Contributing to the Student Early Warning System

Thank you for your interest in contributing to the Student Early Warning System project. This document outlines the process for contributing code, reporting issues, and suggesting improvements.

## Project Overview

The Student Early Warning System is designed to help educational institutions identify and support at-risk students through attendance tracking, academic performance monitoring, and risk analysis.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Development Workflow](#development-workflow)
- [Coding Standards](#coding-standards)
- [Testing Requirements](#testing-requirements)
- [Reporting Issues](#reporting-issues)
- [Common Issues & Troubleshooting](#common-issues--troubleshooting)
- [Pull Request Checklist](#pull-request-checklist)
- [Code of Conduct](#code-of-conduct)

---

## Prerequisites

Before contributing, ensure you have the following installed:

- Java 21 or later
- Maven 3.9 or later
- Git
- Visual Studio Code or IntelliJ IDEA

---

## Getting Started

### 1. Fork the Repository

Click the **Fork** button on GitHub to create your own copy of the repository.

### 2. Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/student-early-warning-system.git
```

### 3. Navigate to the Project Directory

```bash
cd student-early-warning-system
```

### 4. Build the Project

```bash
mvn clean install
```

### 5. Run Tests

```bash
mvn test
```

### 6. Run the Application

```bash
mvn spring-boot:run
```

---

## Development Workflow

### Create a New Branch

Create a feature branch before making changes:

```bash
git checkout -b feature/your-feature-name
```

Example:

```bash
git checkout -b feature/student-dashboard
```

### Make Changes

Implement your feature, enhancement, or bug fix while following the project's coding standards.

### Commit Your Changes

Use clear and descriptive commit messages.

```bash
git add .
git commit -m "Add student dashboard feature"
```

### Push Your Changes

```bash
git push origin feature/your-feature-name
```

### Create a Pull Request

Submit a Pull Request (PR) from your feature branch to the `main` branch.

Provide:
- A clear title
- A description of the changes made
- Any relevant screenshots or documentation updates

---

## Coding Standards

Please follow these guidelines:

- Use meaningful variable and method names.
- Follow standard Java naming conventions.
- Keep methods focused and concise.
- Write comments where necessary.
- Ensure code is readable and maintainable.
- Follow object-oriented design principles.

---

## Testing Requirements

Before submitting a Pull Request:

- Ensure all tests pass.
- Add tests for new functionality where applicable.
- Verify that existing functionality is not broken.

Run tests using:

```bash
mvn test
```

---

## Reporting Issues

If you find a bug or have a suggestion:

1. Check existing Issues to avoid duplicates.
2. Create a new Issue.
3. Provide:
   - A clear title
   - Steps to reproduce the problem
   - Expected behavior
   - Actual behavior
   - Screenshots if applicable

---

## Good First Issues

New contributors are encouraged to start with issues labeled:

- `good-first-issue`
- `documentation`
- `enhancement`

These tasks are designed to help contributors become familiar with the project.

---

## Common Issues & Troubleshooting

### Maven build fails
Ensure you have Java 21+ installed:

```bash
java -version
mvn -version
```

### Port already in use
If port 8080 is already in use, change it in `src/main/resources/application.properties`:

### Tests failing
Ensure you have a clean build before running tests:

```bash
mvn clean test
```

---

## Pull Request Checklist

Before submitting your Pull Request, ensure that:

- [ ] Code builds successfully.
- [ ] Tests pass successfully.
- [ ] Documentation has been updated if necessary.
- [ ] Code follows project conventions.
- [ ] Changes are focused on a single feature or fix.

---

## Code of Conduct

Contributors should:

- Be respectful and professional.
- Provide constructive feedback.
- Collaborate positively with other contributors.
- Maintain an inclusive and welcoming environment.

---

## Contact

For questions regarding contributions, please create a GitHub Issue or contact the project maintainers through the repository.

Thank you for helping improve the Student Early Warning System!