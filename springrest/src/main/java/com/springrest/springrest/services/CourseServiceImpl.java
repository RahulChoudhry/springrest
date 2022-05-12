package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(111,"Core Java","Java basic content course"));
		list.add(new Course(112,"Android","Content of android course"));
		list.add(new Course(113,"Python","Content of paython course"));
	}

	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course deleteCourse(long courseId) {
		Course c = null;
		for(Course course:list)
		{
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}



}
