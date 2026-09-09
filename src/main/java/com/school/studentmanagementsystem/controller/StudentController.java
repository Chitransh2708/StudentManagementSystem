package com.school.studentmanagementsystem.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    @PostMapping("/students")
    public String createStudent(){
        return "Hello Student";
    }

    @GetMapping("/students")
    public String getAllStudent(){
        return "Hello Student";
    }

    @GetMapping("/students/{id}")
    public String getStudentById(@PathVariable int id){
        return "Hello Student";
    }

    @PutMapping("/students/{id}")
    public String updateCompleteStudent(){
        return "Hello Student";
    }

    @PatchMapping("/students/{id}")
    public String partiallyUpdateStudent(){
        return "Hello Student";
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(){
        return "Hello Student";
    }

    @GetMapping("/students/{id}")
    public String searchStudent(){
        return "Hello Student";
    }
}
