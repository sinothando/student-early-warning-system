package tests;

import model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.inmemory.InMemoryStudentRepository;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryStudentRepositoryTest {

    private InMemoryStudentRepository repository;

    @BeforeEach
    void setUp() {
        repository = new InMemoryStudentRepository();
    }

    @Test
    void testSaveAndFindById() {

        Student student = new Student("S1", "Sino", "Active");

        repository.save(student);

        assertTrue(repository.findById("S1").isPresent());
    }

    @Test
    void testFindAll() {

        repository.save(new Student("S1", "Sino", "Active"));
        repository.save(new Student("S2", "Alex", "AtRisk"));

        assertEquals(2, repository.findAll().size());
    }

    @Test
    void testDelete() {

        Student student = new Student("S1", "Sino", "Active");

        repository.save(student);
        repository.delete("S1");

        assertFalse(repository.findById("S1").isPresent());
    }
}