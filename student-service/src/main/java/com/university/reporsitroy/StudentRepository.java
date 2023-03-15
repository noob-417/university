package com.university.reporsitroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.university.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
