package com.api.crud.service;

import com.api.crud.entity.Student;
import com.api.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
  @Autowired
  StudentRepository studentRepository;

  public List<Student> getStudents(){
    return studentRepository.findAll();
  }

  public Optional<Student> getStudent(Long id){
    return studentRepository.findById(id);
  }

  public void saveOurUpdate(Student student){
    studentRepository.save(student);
  }

  public void delete(Long id){
    studentRepository.deleteById(id);
  }
}
