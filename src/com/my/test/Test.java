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

public class Test{
	// 1）关联查询
	// 2）添加学生与学生证信息
	// 3）根据id删除学生证信息
	// 4）根据id修改学生证与学生信息
	public static void main(String[] args) {

		SqlSession session = MybatisUtil.openseesion();
		StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		CardMapper cardMapper = session.getMapper(CardMapper.class);

		// Card card = new Card();
		// card.setCardNo(2);
		// card.setDepartName("二部");
		// card.setBirthplace(new Date(2018, 3, 21));
		// cardMapper.saveCard(card);
		//
//		 Student student = new Student();
//		 student.setStuNo(2);
//		 student.setStuName("陈宇");
//		 student.setClassName("二班");
//		 student.setStuId(card.getId());
//		 studentMapper.saveStudent(student);

		// System.out.println(cardMapper.selectCardById(1));
		// System.out.println(studentMapper.selectStudentById(1));

		// cardMapper.deleteCardById(2);

//		Card newcard = new Card();
//		newcard.setId(3);
//		newcard.setCardNo(3);
//		newcard.setDepartName("新三部");
//		newcard.setBirthplace(new Date(100, 3, 21));
//		cardMapper.updateCardById(newcard);

//		Student newstudent = new Student();
//		newstudent.setId(2);
//		newstudent.setStuNo(119);
//		newstudent.setStuName("新陈宇");
//		newstudent.setClassName("二班");
//		newstudent.setStuId(3);
		// studentMapper.updateStudentById(newstudent);


		session.commit();
		session.close();

	}

}
