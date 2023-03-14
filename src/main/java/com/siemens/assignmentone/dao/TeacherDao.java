package com.siemens.assignmentone.dao;

import com.siemens.assignmentone.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherDao extends JpaRepository<Teacher, Long> {

    Teacher save(Teacher teacher);

    Teacher getTeacherByEmail(String email);

    List<Teacher> getTeacherByFirstNameContainingOrLastNameContaining(String letterFirstName, String letterLastName);

    void deleteTeacherById(Long id);

}
