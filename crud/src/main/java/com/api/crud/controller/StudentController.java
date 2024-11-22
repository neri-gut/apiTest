package com.api.crud.controller;


import com.api.crud.entity.Student;
import com.api.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

  @Autowired
  private StudentService studentService;

  @GetMapping
  public List<Student> getAll(){
    return studentService.getStudents();
  }

  @GetMapping("/{studentId}")
  public Optional<Student> getById(@PathVariable("studentId") Long studentId){
    return studentService.getStudent(studentId);
  }

  @PostMapping
  public void SaveOrUpdate(@RequestBody Student student){
    studentService.saveOurUpdate(student);
  }

  @DeleteMapping("{studentId}")
  public void SaveUpdate(@PathVariable("studentId") Long studentId){
    studentService.delete(studentId);
  }
}
