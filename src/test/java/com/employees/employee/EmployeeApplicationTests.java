package com.employees.employee;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class EmployeeApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@SneakyThrows
	@Test
	void contextLoads() {
		this.mockMvc.perform(MockMvcRequestBuilders.post("/save")
						.contentType("application/json")
				.content("{\n" +
						"\"firstname\":\"Daniel\",\n" +
						"\"lastname\":\"Salami\",\n" +
						"\"gender\":\"male\"}"))
				.andExpect(status().is(202))
				.andDo(System.out::println);
	}

}
