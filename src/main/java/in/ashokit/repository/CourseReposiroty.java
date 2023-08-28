package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.model.Course;

public interface CourseReposiroty extends JpaRepository<Course, Integer> {

}
