package in.ashokit.service;

import java.util.List;

import in.ashokit.model.Course;

public interface CourseService {
	
	
	public String upsert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourse();

<<<<<<< .mine



=======

	public void test();
	
>>>>>>> .theirs
	public String deleteCourse(Integer cid);

}
