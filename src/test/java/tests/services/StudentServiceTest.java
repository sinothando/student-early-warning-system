package tests.services;

import model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryStudentRepository;
import services.StudentService;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    private StudentService studentService;

    @BeforeEach
    void setUp() {

        studentService = new StudentService(
                new InMemoryStudentRepository()
        );
    }

    @Test
    void testAddStudent() {

        Student student =
                new Student("S1", "Sino", "Active");

        studentService.addStudent(student);

        assertEquals("Sino",
                studentService.getStudent("S1").getName());
    }

    @Test
    void testInvalidStudent() {

        Student student =
                new Student("", "Sino", "Active");

        assertThrows(
                IllegalArgumentException.class,
                () -> studentService.addStudent(student)
        );
    }
}
