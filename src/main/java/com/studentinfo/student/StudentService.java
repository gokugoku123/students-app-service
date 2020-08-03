package com.studentinfo.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentinfo.models.Student;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository studentRepository;
	
	public List<Student> getAll() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	
	public Student getStudent(String id) {
		return studentRepository.findBysId(id);
	}
	
	
	public List<Student> getAllStudentsFromList(List<String> studentList) {
		List<Student> resultList = new ArrayList<>();
		
		for(String k : studentList)
			resultList.add(studentRepository.findBysId(k));
		return resultList;
	}
	
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void updateStudent(String id, Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(String id) {
		studentRepository.deleteBysId(id);
	}
	
}
