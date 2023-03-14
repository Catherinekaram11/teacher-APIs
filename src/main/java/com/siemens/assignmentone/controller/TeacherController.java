package com.siemens.assignmentone.controller;

import com.siemens.assignmentone.model.Teacher;
import com.siemens.assignmentone.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

//    @PostMapping()
//    public ResponseEntity<Teacher> addTeacher (@RequestBody Teacher teacher)
//    {
//        teacherService.addTeacher (teacher);
//    }
}
