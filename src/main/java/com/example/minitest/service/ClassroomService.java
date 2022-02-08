package com.example.minitest.service;

import com.example.minitest.model.Classroom;
import com.example.minitest.repository.ClassroomRepo;
import com.example.minitest.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements IClassroomService{
    @Autowired
    ClassroomRepo classroomRepo;

    @Override
    public List<Classroom> findAll() {
        return (List<Classroom>) classroomRepo.findAll();
    }
}
