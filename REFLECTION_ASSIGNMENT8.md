# Reflection
## Assignment 8: Object State and Activity Workflow Modeling

---

## Introduction
This assignment focused on modeling the dynamic behavior of the Student Early Warning System using state transition diagrams and activity diagrams. It provided a deeper understanding of how system components behave over time and how workflows are executed.

---

## Challenges in Choosing Granularity

One of the main challenges was determining the appropriate level of detail (granularity) for both state and activity diagrams. Including too many states or actions made the diagrams complex and difficult to read, while using too few reduced their usefulness and clarity.

For example, in the Student state diagram, adding too many intermediate states made the diagram cluttered. However, simplifying it too much removed important transitions such as “At Risk” and “Supported,” which are critical to the system’s purpose.

A balance had to be achieved by including only meaningful states that represent real changes in the system, while avoiding unnecessary detail. This ensured that the diagrams remained both accurate and readable.

---

## Challenges in Aligning Diagrams with Agile User Stories

Another challenge was ensuring consistency between the diagrams and the Agile artifacts created in Assignment 6. Each diagram needed to reflect user stories, functional requirements, and sprint tasks.

For example:
- The Risk Detection activity diagram had to align with **US-009: Detect academic risk**
- The Alert workflow needed to reflect **US-010: Generate alerts**

Maintaining this alignment required careful mapping between diagrams, requirements, and user stories. This process highlighted the importance of traceability in software engineering, ensuring that all system designs are based on previously defined requirements.

---

## Comparison: State Diagrams vs Activity Diagrams

State diagrams and activity diagrams serve different but complementary purposes in system modeling.

### State Diagrams (Object Behavior)
State diagrams focus on how a specific object changes over time. They show the lifecycle of an object and how it transitions between states based on events or conditions.

For example, the Student state diagram shows how a student moves from “Active” to “At Risk” and then to “Supported” or “Improved.” This helps in understanding object behavior and system responses to changes.

### Activity Diagrams (Process Flow)
Activity diagrams focus on workflows and processes. They show the sequence of actions, decisions, and parallel activities involved in completing a task.

For example, the Risk Detection workflow shows how data is processed, decisions are made, and alerts are generated. This helps in understanding how different components interact to achieve a system goal.

### Key Difference
- State diagrams answer: **“What happens to an object over time?”**
- Activity diagrams answer: **“How does a process flow from start to end?”**

Together, they provide a complete view of system behavior.

---

## Lessons Learned

This assignment improved my understanding of system dynamics and workflow modeling. It demonstrated how diagrams can be used to simplify complex systems and improve communication between stakeholders and developers.

Additionally, it highlighted the importance of maintaining consistency between requirements, user stories, and system design artifacts.

---

## Conclusion

Overall, this assignment provided valuable experience in modeling both object behavior and system workflows. Despite the challenges, it strengthened my understanding of UML diagrams and their role in software design, especially when integrated with Agile development practices.