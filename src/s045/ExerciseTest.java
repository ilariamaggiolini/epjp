package s045;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciseTest {

	@Test
	void toUpperNull() {
		String result = Exercise.toUpper(null);

		assertNull(result);
	}

	@Test
	void toUpperEmpty() {
		String result = Exercise.toUpper("");

		assertTrue(result.isEmpty());
    }
	
	@Test
	void toUpperBob() {
		String result = Exercise.toUpper("Bob");

		assertEquals("BOB", result);
    }
}
