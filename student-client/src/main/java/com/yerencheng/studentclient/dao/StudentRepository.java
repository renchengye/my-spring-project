package com.yerencheng.studentclient.dao;

import com.yerencheng.studentclient.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("from Student where name=:cn")
    public Student findMyStudentName(@Param("cn") String name);
}
