package com.springboot.controller;

import com.springboot.entity.Course;
import com.springboot.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String normalTest(){
        return "slash view";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId){
        Course c=this.courseService.getCourse(Long.parseLong(courseId));
        System.out.println(c);
        return c;
    }

    @PostMapping("/courses")
    public Course addNewCourse(@RequestBody Course c){
        return courseService.addNewCourse(c);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try {
            courseService.deleteCourse(Long.parseLong(courseId));
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }
}
