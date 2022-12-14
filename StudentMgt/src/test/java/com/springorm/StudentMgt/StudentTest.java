package com.springorm.StudentMgt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.StudentMgt.Dao.StudentDao;
import com.springorm.StudentMgt.entities.Student;

public class StudentTest {
	static StudentDao sdao;
	
	@BeforeAll
	public static void init() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		sdao = (StudentDao) ac.getBean("Stdao");
	}
	
	@Test
	public void testGetStudent() {
		//positive case
		Student st = sdao.getStudent(4);
		assertEquals(4, st.getSid());
	}
	
	@Test
	public void testUpdateStudent() {
		//negative case
		Student st = sdao.getStudent(1);
		st.setSname("Rohan");
		assertEquals(1, sdao.updateStudent(st));
	}

} 
