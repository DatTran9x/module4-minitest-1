package com.example.minitest.service;

import com.example.minitest.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void save(Student student);
    void delete(int id);
    Student findById(int id);
    List<Student> findByName(String name);
}
