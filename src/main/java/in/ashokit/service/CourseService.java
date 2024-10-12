package in.ashokit.service;

import java.util.List;

import in.ashokit.model.Course;

public interface CourseService {
	
	
	public String upsert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourse();

	public String deleteCourse(Integer cid);

}
