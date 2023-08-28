package in.ashokit.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.model.Course;
import in.ashokit.service.CourseService;


@ExtendWith((SpringExtension.class))
@WebMvcTest(value = CourseController.class)
class CourseControllerTest {

    @MockBean
    private CourseService courseService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private static Course  course;

    @BeforeEach
    void setUp() {
        course= new Course(1,"Math",100.0);
     
    }

    @Test
    void createCourse() throws Exception {
    	
    }

    @Test
    void getCourse() {
    }

    @Test
    void getAllCourse() {
    }

    @Test
    void updateCourse() {
    }

    @Test
    void deleteCourse() {
    }


    @AfterEach
    void tearDown() {
        course=null;

    }
}