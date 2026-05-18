package api;

import model.Student;
import org.springframework.web.bind.annotation.*;
import repositories.inmemory.InMemoryStudentRepository;
import services.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


import java.util.List;

@RestController
@RequestMapping("/api/students")
@Tag(name = "Students", description = "Student Management API")
public class StudentController {

    private final StudentService studentService =
            new StudentService(
                    new InMemoryStudentRepository()
            );

    @Operation(summary = "Fetch all students")
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @Operation(summary = "Create a new student")
    @PostMapping
    public String addStudent(@RequestBody Student student) {

        studentService.addStudent(student);

        return "Student added successfully";
    }

    @GetMapping("/{id}")
    @Operation(summary = "Fetch student by ID")
    public Student getStudent(@PathVariable String id) {
        return studentService.getStudent(id);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a student")
    public String deleteStudent(@PathVariable String id) {

        studentService.deleteStudent(id);

        return "Student deleted successfully";
    }
}
