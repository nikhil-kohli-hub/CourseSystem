package com.ldtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldtech.entity.Course;
import com.ldtech.repository.CourseRepository;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository repository;

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Course getCourse(int courseId) {
		// TODO Auto-generated method stub
		return repository.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		repository.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		repository.save(course);
		return course;
	}

	@Override
	public boolean deleteCourse(int parseLong) {
		// TODO Auto-generated method stub
		Course entity=repository.findById(parseLong).get();
		if(entity!=null)
		 {
			 repository.delete(entity);
			 return true;
		 }
		 return false;
		
	}

}
