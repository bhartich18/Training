package com.globallogic.assessment4.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globallogic.assessment4.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
	@Query("Select name from Student")
	public List<String> findName();
}
