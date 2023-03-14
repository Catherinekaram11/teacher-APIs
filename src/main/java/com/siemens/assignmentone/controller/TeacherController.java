package com.siemens.assignmentone.controller;

import com.siemens.assignmentone.model.Teacher;
import com.siemens.assignmentone.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping()
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher) {
        return ResponseEntity.ok(teacherService.addTeacher(teacher));
    }

    @GetMapping("/getAllTeachers")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/getByEmail")
    public ResponseEntity<Teacher> getTeacherByEmail(@RequestParam String email) {
        return ResponseEntity.ok(teacherService.getTeacherByEmail(email));
    }

    @GetMapping("/getByLetter")
    public List<Teacher> getTeacherByLetter(@RequestParam String letter) {
        return teacherService.getTeacherFirstnameOrLastnameContaining(letter);
    }

    @GetMapping("/getContainingA")
    public List<Teacher> getTeacherContainingA() {
        return teacherService.getTeacherFirstnameOrLastnameContaining("a");
    }

    @DeleteMapping("/deleteTeacher")
    public ResponseEntity deleteTeacher(@RequestParam Long id) {
        teacherService.deleteTeacher(id);
        return ResponseEntity.ok().build();

    }


}
