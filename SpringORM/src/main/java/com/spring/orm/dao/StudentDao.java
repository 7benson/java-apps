package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student st) {
		Integer i = (Integer) this.hibernateTemplate.save(st);
		return i;
	}

	public Student getStudent(int id) {
		return this.hibernateTemplate.get(Student.class, id);
	}

	public List<Student> getAllStudents(int id) {
		return this.hibernateTemplate.loadAll(Student.class);
	}

	@Transactional
	public void deleteStudent(int id) {
		Student st = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(st);
	}
	@Transactional
	public void updateStudent(Student st) {
		this.hibernateTemplate.update(st);
	}
}
