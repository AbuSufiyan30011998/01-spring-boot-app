package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.model.Course;
import in.ashokit.repository.CourseReposiroty;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseReposiroty cousrseRepository;

	@Override
	public String upsert(Course course) {
		cousrseRepository.save(course);
		return "success..!!";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById = cousrseRepository.findById(cid);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		return cousrseRepository.findAll();
	}

	@Override
	public String deleteCourse(Integer cid) {
		if(cousrseRepository.existsById(cid)) {
			cousrseRepository.deleteById(cid);
			return "delete success..!!";
		}
		else {
			return "no record found..!!";
		}
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
