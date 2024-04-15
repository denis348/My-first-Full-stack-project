package com.myfullstackapplication.studentsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfullstackapplication.studentsystem.model.student;
import com.myfullstackapplication.studentsystem.repository.studentRepository;

@Service
public class studentServiceImpl implements studentService {

  @Autowired
  private studentRepository studentRepository;

  @Override
    public student saveStudent(student student) {
     return studentRepository.save(student);
     //throw new UnsupportedOperationException("Record could not be saved");
    }

}

                                                                                                                                                                                                     
