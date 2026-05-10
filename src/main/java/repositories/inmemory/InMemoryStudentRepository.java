package repositories.inmemory;

import model.Student;
import repositories.StudentRepository;

import java.util.*;

public class InMemoryStudentRepository implements StudentRepository {

    private final Map<String, Student> storage = new HashMap<>();

    @Override
    public void save(Student student) {
        storage.put(student.getStudentId(), student);
    }

    @Override
    public Optional<Student> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}