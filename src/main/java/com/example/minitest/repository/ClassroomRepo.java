package com.example.minitest.repository;

import com.example.minitest.model.Classroom;
import org.springframework.data.repository.CrudRepository;

public interface ClassroomRepo extends CrudRepository<Classroom,Integer> {
}
