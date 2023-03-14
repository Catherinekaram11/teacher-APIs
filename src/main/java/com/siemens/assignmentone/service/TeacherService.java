package com.siemens.assignmentone.service;

import com.siemens.assignmentone.dao.TeacherDao;
import com.siemens.assignmentone.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherDao teacherDao;

    @Autowired
    public TeacherService(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public Teacher addTeacher(Teacher teacher) {
        return teacherDao.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherDao.findAll();
    }

    public Teacher getTeacherByEmail(String email) {
        return teacherDao.getTeacherByEmail(email);
    }

    public List<Teacher> getTeacherFirstnameOrLastnameContaining(String letter) {
        return teacherDao.getTeacherByFirstNameContainingOrLastNameContaining(letter, letter);
    }

    @Transactional
    public void deleteTeacher(Long id) {
        teacherDao.deleteTeacherById(id);
    }


}
