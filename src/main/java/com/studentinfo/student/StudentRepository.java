package com.studentinfo.student;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studentinfo.models.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	
	public Student findBysId(String id);
	public void deleteBysId(String id);
	
	
}
