package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Student;

import java.util.List;

@Repository
public interface  StudentRepository extends CrudRepository<Student, Long> {
    // following are custom methods
   Student findByAccountNo (Long accountNo) ;
   List<Student> findByNameContaining(String name);
}
