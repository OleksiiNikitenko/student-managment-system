package com.university.studentmanagmentsystem.repository;

import com.university.studentmanagmentsystem.model.StudentMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMarksRepository extends JpaRepository<StudentMarks, Long> {
}
