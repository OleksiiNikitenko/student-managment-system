package com.university.studentmanagmentsystem.service;

import com.university.studentmanagmentsystem.exception.UserNotFoundException;
import com.university.studentmanagmentsystem.model.Teacher;
import com.university.studentmanagmentsystem.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher addTeacher(Teacher teacher) {
        teacher.setTeacherCode(UUID.randomUUID().toString());
        return teacherRepository.save(teacher);
    }

    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteTeacherById(id);
    }

    public Teacher findTeacherById(Long id) {
        return teacherRepository.findTeacherById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found..."));
    }
}
