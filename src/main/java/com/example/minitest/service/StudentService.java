package com.example.minitest.service;

import com.example.minitest.model.Student;
import com.example.minitest.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void delete(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Student findById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public List<Student> findByName(String name) {
        return studentRepo.findAllByNameContaining(name);
    }
}
