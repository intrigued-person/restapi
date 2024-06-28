package com.rest.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.rest.model.Student;
import com.rest.repository.StudentRepo;
import com.rest.service.StudentService;

@Service
public class StudentImp implements StudentService {

	
	StudentRepo repo;
	

	public StudentImp(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void addStudent(Student stud) {
		repo.save(stud);
	}

	@Override
	public Student getStudent(int id) {
		 Optional<Student> leaveOptional = repo.findById(id);
		    return leaveOptional.orElse(null);

	}
	@Override
	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	@Override
	public void updateStudent(Student stud) {
		repo.save(stud);
		
	}
	
	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

}
