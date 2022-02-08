package com.example.minitest.controller;

import com.example.minitest.model.Classroom;
import com.example.minitest.model.Student;
import com.example.minitest.service.IClassroomService;
import com.example.minitest.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/home")
public class StudentController {
    @Autowired
    IStudentService studentService;

    @Autowired
    IClassroomService classroomService;

    @GetMapping
    public ResponseEntity<List<Student>> getListStudent() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Classroom>> getListClassrooms() {
        return new ResponseEntity<>(classroomService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id) {
        return new ResponseEntity(studentService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Student>> search(@PathVariable String name) {
        return new ResponseEntity(studentService.findByName(name), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteStudent(@PathVariable int id) {
        studentService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
