package StudentManagementSystem.studentManagementSystem.studentController;

import StudentManagementSystem.studentManagementSystem.studentEntity.StudentEntity;
import StudentManagementSystem.studentManagementSystem.studentService.StudentService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // Get All Students
    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return service.getAllStudents();
    }

    // Get Student By Id
    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable Integer id) {
        return service.getStudentById(id);
    }

    // Add Student
    @PostMapping
    public StudentEntity addStudent(@Valid @RequestBody StudentEntity student) {
        return service.addStudent(student);
    }

    // Update Student
    @PutMapping("/{id}")
    public StudentEntity updateStudent(@PathVariable Integer id,
                                       @RequestBody StudentEntity student) {
        student.setId(id);
        return service.updateStudent(student);
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        service.deleteStudent(id);
        return "Student Deleted Successfully";
    }
}