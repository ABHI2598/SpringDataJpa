package com.example.spring_data_jpa_tutorial.repository;

import com.example.spring_data_jpa_tutorial.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //this will create automatic query for finding firstName if we provide correct firstName column name
    //this is JPQL
    public List<Student> findByFirstName(String firstName);

    public  List<Student> findByFirstNameContaining(String firstName);

    public  List<Student> findByLastNameNotNull();

    public List<Student> findByGuardianName(String guardianName);

    @Query("SELECT s from Student s where s.emailId = ?1")
    Student getStudentsByEmailAddress(String EmailId);


    @Query(value = "SELECT * from tbl_student s where s.email_address = ?1", nativeQuery = true)
    Student getStudentsByEmailNativeQuery(String EmailId);

    @Query(value = "SELECT * from tbl_student s where s.email_address= :emailId", nativeQuery = true)
    Student getStudentsByEmailNativeQueryNamedParam(@Param("emailId") String EmailId);

    @Modifying
    @Transactional
    @Query(
            value = "UPDATE tbl_student s set first_name = ?1 where email_address= ?2",
            nativeQuery = true
    )
    int updateStudentNameByEmailId(String firstName, String emailId);
}
