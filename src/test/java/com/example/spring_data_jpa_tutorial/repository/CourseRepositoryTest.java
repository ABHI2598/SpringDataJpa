package com.example.spring_data_jpa_tutorial.repository;

import com.example.spring_data_jpa_tutorial.entity.Course;
import com.example.spring_data_jpa_tutorial.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import  java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private  CourseRepository courseRepository;

    @Test
    public void saveCourses() {
        Course c = Course.builder()
                .courseName("Rust")
                .credits(10l)
                .build();
        courseRepository.save(c);
    }

    @Test
    public void getAllCourseS() {
        List<Course> courseList = courseRepository.findAll();

        System.out.println(".........Course List........... : "+ courseList);
    }
}