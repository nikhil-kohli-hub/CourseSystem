package com.ldtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldtech.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Integer> {

}
