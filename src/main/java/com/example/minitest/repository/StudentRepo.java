package com.example.minitest.repository;

import com.example.minitest.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student,Integer> {
    List<Student> findAllByNameContaining(String name);
}
