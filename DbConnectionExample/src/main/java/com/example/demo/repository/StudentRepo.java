package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.beans.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
	List<Student> findByName(String username);
	List<Student> findByIdBetween(Integer start,Integer stop);
	List<Student> findByAddressIgnoreCase(String username);
	@Query("select u from student u where u.id=?1")
	Student findByAddress(String address);
}
	
