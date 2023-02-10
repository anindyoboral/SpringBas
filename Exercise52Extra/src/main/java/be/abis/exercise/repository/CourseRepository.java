package be.abis.exercise.repository;

import be.abis.exercise.model.Course;

import java.util.List;


public interface CourseRepository {

	public List<Course> findAllCourses();
	public Course findCourse(int id);
	public Course findCourse(String shortTitle);
	public void addCourse(Course c);
	public void updateCourse(Course c);
	public void deleteCourse(int id);
}
