package com.example.Student.Service;

import com.example.Student.Respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    StudentRepository studentRepository;
    // Constructor Injection
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }
    public String getStudent()
    {
        String student = studentRepository.getStudent();
        return student;
    }
}
