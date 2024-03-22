package com.mock.mockApp;

import com.mock.mockApp.logic.MinSubDef;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class MockAppApplicationTests {

	@InjectMocks
	MinSubDef app;
	@Test
	@DisplayName("Test Case 1")
	void TestCase1() {
		String[] input = new String[] {"poedjzskebwqrtqo", "poej"};
		assertEquals("poedj",app.MinWindowSubstring(input));
	}

	@Test
	@DisplayName("Test Case 2")
	void TestCase2(){
		String[] input = new String[] {"ahffaksfajeeubsne", "jefaa"};
		assertEquals("aksfaje",app.MinWindowSubstring(input));
	}
	@Test
	@DisplayName("Test Case 3")
	void TestCase3(){
		String[] input = new String[] {"aaffhkksemckelloe", "ekol"};
		assertEquals("kello",app.MinWindowSubstring(input));
	}
	@Test
	@DisplayName("Test Case 4")
	void TestCase4(){
		String[] input = new String[] {"wgaevifawegusiafbuawgvjfgibasu", "aiu"};
		assertEquals("usia",app.MinWindowSubstring(input));
	}


}
