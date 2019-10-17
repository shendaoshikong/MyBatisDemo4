package com.my.mapper;

import java.util.List;

import com.my.vo.Student;

public interface StudentMapper {

	public Student selectStudentById(int id);

	public void saveStudent(Student student);

	public void deleteStudentById(int id);

	public void updateStudentById(Student student);
}