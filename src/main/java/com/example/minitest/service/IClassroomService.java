package com.example.minitest.service;

import com.example.minitest.model.Classroom;

import java.util.List;

public interface IClassroomService {
    List<Classroom> findAll();
}
