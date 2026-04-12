# Template Analysis
## Student Early Warning System

---

## Comparison of GitHub Project Templates

| Template | Columns / Workflow | Automation Features | Agile Suitability |
|---------|------------------|--------------------|------------------|
| Basic Kanban | To Do, In Progress, Done | No automation | Suitable for simple task tracking but lacks advanced Agile features |
| Automated Kanban | To Do, In Progress, Done | Automatically moves issues when status changes | Highly suitable for Agile as it supports continuous workflow and reduces manual updates |
| Bug Triage | New, Needs Review, Fixed | Automatically categorizes issues | Suitable for bug tracking but not ideal for full system development |

---

## Analysis

### Basic Kanban
The Basic Kanban template provides a simple workflow with three columns: To Do, In Progress, and Done. It does not include automation, which means tasks must be manually moved between stages. While this is useful for small projects, it does not fully support Agile practices such as continuous delivery and workflow efficiency.

### Automated Kanban
The Automated Kanban template enhances the basic workflow by automatically moving issues between columns based on their status. This reduces manual effort and ensures that task progress is always up to date. It supports Agile principles such as continuous delivery, transparency, and adaptability.

### Bug Triage
The Bug Triage template is designed specifically for managing system issues and bugs. It includes workflows for reviewing and fixing issues but does not support full Agile development processes such as sprint planning and backlog management.

---

## Justification for Selected Template

The **Automated Kanban template** was selected because it best aligns with the needs of the Student Early Warning System.

This system involves multiple tasks such as:
- Recording attendance
- Uploading grades
- Performing risk detection
- Generating alerts

These tasks require continuous updates and tracking. The Automated Kanban template ensures that issues (user stories) automatically move between workflow stages, improving efficiency and reducing manual work.

Additionally, the template integrates well with GitHub Issues created in Assignment 6, allowing seamless tracking of user stories and sprint tasks.

Compared to other templates:
- It provides better workflow automation than Basic Kanban
- It is more suitable for full system development than Bug Triage

Therefore, the Automated Kanban template is the most appropriate choice for supporting Agile development in this project.

---

## Conclusion

The evaluation of GitHub project templates shows that Automated Kanban offers the best balance between simplicity and functionality. Its automation features and Agile alignment make it ideal for managing the development of the Student Early Warning System.