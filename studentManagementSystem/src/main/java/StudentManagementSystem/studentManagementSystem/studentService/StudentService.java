package StudentManagementSystem.studentManagementSystem.studentService;

import StudentManagementSystem.studentManagementSystem.studentEntity.StudentEntity;
import StudentManagementSystem.studentManagementSystem.studentRepository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    public List<StudentEntity> getAllStudents() {
        return repository.findAll();
    }

    public StudentEntity addStudent(StudentEntity student) {
        return repository.save(student);
    }

    public StudentEntity getStudentById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public StudentEntity updateStudent(StudentEntity student) {
        return repository.save(student);
    }

    public void deleteStudent(Integer id) {
        repository.deleteById(id);
    }

}
