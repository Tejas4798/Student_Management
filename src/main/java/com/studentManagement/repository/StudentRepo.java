package com.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentManagement.Entities.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
