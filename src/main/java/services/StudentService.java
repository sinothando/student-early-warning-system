package services;

import model.Student;
import repositories.StudentRepository;

import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Create Student
    public void addStudent(Student student) {

        if (student.getStudentId() == null || student.getStudentId().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty");
        }

        studentRepository.save(student);
    }

    // Get Student
    public Student getStudent(String id) {

        return studentRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Student not found"));
    }

    // Get All Students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Delete Student
    public void deleteStudent(String id) {
        studentRepository.delete(id);
    }
}