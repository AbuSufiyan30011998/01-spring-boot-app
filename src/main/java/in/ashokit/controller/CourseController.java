package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.Course;
import in.ashokit.service.CourseService;

@RestController
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody  Course course){
		String upsert = courseService.upsert(course);
		return new ResponseEntity<String>(upsert,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid){
		return ResponseEntity.status(HttpStatus.OK).body(courseService.getById(cid));
		
	}
	
	@GetMapping("/course")
	public ResponseEntity<List<Course>> getAllCourse(){
		List<Course> courses = courseService.getAllCourse();
		return new ResponseEntity<List<Course>>(courses,HttpStatus.OK);
		
	}
	
	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody  Course course){
		String updateCourse = courseService.upsert(course);
		return new ResponseEntity<String>(updateCourse,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid){
		String deleteCourse = courseService.deleteCourse(cid);
		return new ResponseEntity<String>(deleteCourse,HttpStatus.OK);
	}

}
