package com.student.StudentManagement.controller;

import com.student.StudentManagement.dto.RequestStudentDto;
import com.student.StudentManagement.dto.RespenseStudentDto;
import com.student.StudentManagement.model.Carriere;
import com.student.StudentManagement.model.StudentPojo;
import com.student.StudentManagement.services.CarriereService;
import com.student.StudentManagement.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public void SaveStudent(@RequestBody StudentPojo data) {
        studentService.saveStudent(data);

    }

    @GetMapping("/viewStudents")
    public List<RespenseStudentDto> viewStudents() {
        System.out.println("controller");
        return studentService.getAllStudents();

    }


    @GetMapping("/viewStudent/{apogee}")
    public RequestStudentDto viewStudent(@PathVariable(value = "apogee") Long apogee) {
        return studentService.getStudentByApogee(apogee);

    }


    @GetMapping("/deleteStudent/{apogee}")
    public void deleteStudent(@PathVariable(value = "apogee") Long apogee) {
        studentService.deleteStudent(apogee);
    }

    @GetMapping("/carrieres/{id}")
    public List<Carriere> getCarrieresByStudent(@PathVariable(name = "id") Long id) {
        return studentService.getCarrieresByStudentId(id);
    }
}