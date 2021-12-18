package com.preschool.psms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preschool.psms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
