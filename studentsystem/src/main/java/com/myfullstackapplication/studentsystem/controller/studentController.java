package com.myfullstackapplication.studentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myfullstackapplication.studentsystem.model.student;
import com.myfullstackapplication.studentsystem.service.studentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
   private studentService studentService;

   @PostMapping("/add")
   public ResponseEntity<String> add(@RequestBody student student) {
       studentService.saveStudent(student);
       return new ResponseEntity<>("New user registered",HttpStatus.OK);
   }
   




}
  