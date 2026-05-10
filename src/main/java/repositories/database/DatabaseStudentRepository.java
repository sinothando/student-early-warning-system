package repositories.database;

import model.Student;
import repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

public class DatabaseStudentRepository implements StudentRepository {

    @Override
    public void save(Student entity) {
        throw new UnsupportedOperationException("Database implementation coming soon");
    }

    @Override
    public Optional<Student> findById(String id) {
        throw new UnsupportedOperationException("Database implementation coming soon");
    }

    @Override
    public List<Student> findAll() {
        throw new UnsupportedOperationException("Database implementation coming soon");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database implementation coming soon");
    }
}