package com.university.studentmanagmentsystem.service;

import com.university.studentmanagmentsystem.exception.UserNotFoundException;
import com.university.studentmanagmentsystem.model.Student;
import com.university.studentmanagmentsystem.repository.StudentRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        student.setStudentCode(UUID.randomUUID().toString());
        return studentRepository.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteStudentById(id);
    }

    public Student findStudentById(Long id) {
        return studentRepository.findStudentById(id)
            .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found..."));
    }

//    public MultipartFile uploadMarks(MultipartFile file) {
//        return studentRepository.save(file);
//    }
}
