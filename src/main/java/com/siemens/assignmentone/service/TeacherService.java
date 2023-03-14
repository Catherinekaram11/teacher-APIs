package com.siemens.assignmentone.service;

import com.siemens.assignmentone.dao.TeacherDao;
import com.siemens.assignmentone.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public TeacherService(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacherDao.save();
    }

    public Teacher getTeacherByEmail(String email) {
        return teacherDao.getTeacherByEmail(email);
    }

    public List<Teacher> getTeacherFirstnameOrLastnameContaining(String letter) {
        return teacherDao.getTeachersByFirstNameContainingOrLastNameContaining(letter);
    }

    public void deleteTeacher(Long id) {
        teacherDao.deleteTeacherById(id);
    }


}
