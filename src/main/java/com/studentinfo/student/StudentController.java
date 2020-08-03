package com.studentinfo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentinfo.models.Student;

@RequestMapping("/sinfo")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "HiHello";
	}
	
	@RequestMapping(method=RequestMethod.GET ,value="/students")
	public List<Student> getAll() {
		return studentService.getAll();
	}
	
	@RequestMapping(method=RequestMethod.GET ,value="/students/{sId}")
	public Student getStudent(@PathVariable String sId) {
		return studentService.getStudent(sId);
	}
	
	@PostMapping("/students/studentsList")
	public List<Student> getAllStudentsFromList(@RequestBody List<String> studentList) {
		return studentService.getAllStudentsFromList(studentList);
	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	@RequestMapping(method=RequestMethod.PUT ,value="/students/{sId}")
	public void updateStudent(@PathVariable String sId, @RequestBody Student student) {
		studentService.updateStudent(sId, student);
	}
	@RequestMapping(method=RequestMethod.DELETE ,value="/students/{sId}")
	public void deleteStudent(@PathVariable String sId) {
		studentService.deleteStudent(sId);
	}
}
