package com.my.test;

import java.util.ArrayList;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.my.mapper.CardMapper;
import com.my.mapper.StudentMapper;
import com.my.util.MybatisUtil;
import com.my.vo.Card;
import com.my.vo.Order;
import com.my.vo.Student;

public class Test3{
	// 1）关联查询
	// 2）添加学生与学生证信息
	// 3）根据id删除学生证信息
	// 4）根据id修改学生证与学生信息
	public static void main(String[] args) {

		SqlSession session = MybatisUtil.openseesion();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);

		 Student student = new Student();
		 student.setStuNo(2);
		 student.setStuName("陈宇");
		 student.setClassName("二班");

		studentMapper.saveStudent(student);

		session.commit();
		session.close();
	
	}
}
