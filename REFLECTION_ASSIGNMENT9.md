# Reflection
## Assignment 9: Domain Modeling and Class Diagram Development

---

## Introduction
This assignment focused on designing a domain model and developing a class diagram for the Student Early Warning System. It required identifying key entities, defining their relationships, and ensuring alignment with previous system artifacts such as requirements, user stories, and behavioral diagrams.

---

## Challenges in Abstraction and Entity Identification

One of the main challenges was determining the correct level of abstraction when identifying domain entities. It was initially unclear whether certain components, such as risk evaluation, should be modeled as attributes within the Student class or as independent entities.

For example, the **RiskStatus** class was separated from the Student class to isolate risk evaluation logic. This decision improved modularity but required careful consideration to avoid unnecessary complexity.

---

## Challenges in Defining Relationships

Another challenge was correctly defining relationships between entities, particularly when choosing between association, aggregation, and composition.

- **Composition** was used for entities such as AttendanceRecord and GradeRecord because they are strongly dependent on the Student.
- **Aggregation** was used for Alert since alerts can exist independently for logging and reporting.
- **Inheritance** was introduced through the UserAccount class to represent different system roles such as Student, Lecturer, and AcademicAdvisor.

Understanding when to use each relationship type required a deeper understanding of object-oriented design principles.

---

## Alignment with Previous Assignments

Ensuring consistency with previous assignments was a critical part of this task. The domain model and class diagram were aligned with:

- **Assignment 4 (Functional Requirements)**  
  Features such as risk detection, alert generation, and data storage are directly represented.

- **Assignment 5 (Use Cases)**  
  Actions such as recording attendance, uploading grades, and monitoring students are reflected in class methods.

- **Assignment 6 (Agile User Stories)**  
  User stories such as “Detect academic risk” and “Provide intervention” are represented in the system structure.

- **Assignment 8 (State and Activity Diagrams)**  
  The lifecycle and workflows previously modeled are now supported by class relationships and methods.

This alignment ensured that the system design remained consistent across all stages of development.

---

## Trade-offs in Design

Several trade-offs were made during the design process:

- **Simplicity vs Completeness**  
  While more detailed models could have been created, a balance was maintained to ensure readability and clarity.

- **Inheritance vs Composition**  
  Inheritance was used for user roles to reduce redundancy, while composition was used for dependent entities like records.

- **Modularity vs Complexity**  
  Separating entities such as RiskStatus improved modularity but added more classes to the design.

These trade-offs were necessary to maintain a clear and practical system structure.

---

## Lessons Learned

This assignment improved my understanding of object-oriented design principles, particularly in structuring systems using classes, attributes, and relationships.

I learned:
- How to model real-world systems using domain entities
- The importance of selecting appropriate relationships
- How to ensure consistency across system design artifacts
- The role of class diagrams in bridging analysis and implementation

---

## Conclusion

Overall, this assignment provided valuable experience in domain modeling and system design. It reinforced the importance of abstraction, consistency, and thoughtful design decisions in building scalable and maintainable software systems.