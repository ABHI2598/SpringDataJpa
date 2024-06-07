package com.example.spring_data_jpa_tutorial.repository;

import com.example.spring_data_jpa_tutorial.entity.Course;
import com.example.spring_data_jpa_tutorial.entity.CourseMaterial;
import lombok.ToString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial() {
        Course course = Course.builder()
                .courseName("Java")
                .credits(5l)
                .build();
        CourseMaterial c = CourseMaterial.builder()
                .url("Www.google.com")
                .course(course)
                .build();
        courseMaterialRepository.save(c);
    }

}