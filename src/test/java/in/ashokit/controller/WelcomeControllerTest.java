package in.ashokit.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.ashokit.service.WelcomeService;

@WebMvcTest(value = WelcomeController.class)
public class WelcomeControllerTest {

	@MockBean
	private WelcomeService welcomeService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testWelcomeMessage() throws Exception {

		when(welcomeService.getMessage()).thenReturn("good evening...!!");

		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/welcome");

		ResultActions perform = mockMvc.perform(builder);
		MvcResult mvcResult = perform.andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		int status = response.getStatus();

		assertEquals(200, status);
	}

}
