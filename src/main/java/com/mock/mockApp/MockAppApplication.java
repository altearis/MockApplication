package com.mock.mockApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import com.mock.mockApp.logic.MinSubDef;

@SpringBootApplication
@Slf4j
public class MockAppApplication {

	static MinSubDef logic;

	public static void main(String[] args) {
		SpringApplication.run(MockAppApplication.class, args);
		String[] input = new String[] {"poedjzskebwqrtqo", "poej"};
		String expected = "poedj";
		String result = logic.MinWindowSubstring(input);
		log.info("Input -> {}, Expected Result ->{}, Your Result ->{}.",input[0],expected,result);
	}

}
