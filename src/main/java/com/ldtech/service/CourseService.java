package com.ldtech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ldtech.entity.Course;
@Service
public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(int courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public boolean deleteCourse(int parseLong);

}
