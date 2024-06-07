package com.example.spring_data_jpa_tutorial.repository;

import com.example.spring_data_jpa_tutorial.entity.Course;
import com.example.spring_data_jpa_tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
     private  TeacherRepository teacherRepository;

    @Test
    public void saveTeacher() {
        Course c1 = Course.builder().courseName("Dot Net").credits(4l).build();
        Course c2 = Course.builder().courseName("Python").credits(4l).build();

        //Teacher t = Teacher.builder().firstName("Abhinav").lastName("Pandey").courseList(List.of(c1,c2)).build();
        //teacherRepository.save(t);
    }
}