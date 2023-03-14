package com.siemens.assignmentone.dao;

import com.siemens.assignmentone.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherDao extends JpaRepository<Teacher, Long> {

    public Teacher save();

    public Teacher getTeacherByEmail(String email);

    public List<Teacher> getTeachersByFirstNameContainingOrLastNameContaining(String letter);

    public void deleteTeacherById(Long id);

}
