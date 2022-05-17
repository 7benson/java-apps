package com.springboot.service;

import com.springboot.dao.CourseDao;
import com.springboot.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

//    private List<Course> list;

    @Autowired
    private CourseDao courseDao;

//    public CourseService(){
//        list=new ArrayList<Course>();
//        list.add(new Course(1,"jvaa","not so good language"));
//        list.add(new Course(2,"python","simple but super slow"));
//    }

    public List<Course> getCourses(){
        return courseDao.findAll();
    }

    public Course getCourse(long courseId){
        System.out.println("courseId -->"+courseId);
        Course c=this.courseDao.findById(courseId).get();
        System.out.println(c);
        return c;
    }
    public Course addNewCourse(Course course){
        courseDao.save(course);
        return course;
    }

    public void deleteCourse(long id){
        Course course= courseDao.getById(id);
        courseDao.delete(course);
    }

    public Course updateCourse(Course course){
        courseDao.save(course);
        return course;
    }

}

