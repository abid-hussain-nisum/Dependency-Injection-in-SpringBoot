package com.example.Student.Controller;
import com.example.Student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    // Field Injection
    @Autowired
    StudentService studentService;
    // Setter Injection
    public void setStudentService(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @GetMapping("/getStudent")
    public ResponseEntity<String> getStudent()
    {
        String student = studentService.getStudent();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
