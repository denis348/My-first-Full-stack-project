package com.myfullstackapplication.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myfullstackapplication.studentsystem.model.student;

@Repository
public interface studentRepository extends JpaRepository<student,Integer> {

}
