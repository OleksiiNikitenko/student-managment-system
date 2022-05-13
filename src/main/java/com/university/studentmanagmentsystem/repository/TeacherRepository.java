package com.university.studentmanagmentsystem.repository;

import com.university.studentmanagmentsystem.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    void deleteTeacherById(Long id);

    Optional<Teacher> findTeacherById(Long id);
}
