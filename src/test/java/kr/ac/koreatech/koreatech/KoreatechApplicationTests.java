package kr.ac.koreatech.koreatech;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KoreatechApplicationTests {

	@Test
	void contextLoads() {
   // TODO document why this method is empty
 }

	//두수를 더하는 함수 
	int add(int a, int b) { 
		return a + b;
	}

	//

	@Test 
	void addTest1() { 
		int result = add(10, 20);
		assertEquals(30, result);

	}

}
