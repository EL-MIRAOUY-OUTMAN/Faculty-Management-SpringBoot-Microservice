package com.miraouy.servieetudiant.repository;

import com.miraouy.servieetudiant.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student getStudentByApogee(String apogee);
}
