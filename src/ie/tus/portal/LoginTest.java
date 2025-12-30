package ie.tus.portal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LoginTest {

	@Test
	void testValidLogin() {
		LoginService loginService = new LoginService();
		boolean result = loginService.login("student@student.tus.ie", "password123");
		assertTrue(result, "Login should succeed with correct credentials");
	}

	@Test
	void testInvalidLogin() {
		LoginService loginService = new LoginService();
		boolean result = loginService.login("student@student.tus.ie", "WRONG_PASSWORD");
		assertFalse(result, "Login should fail with an incorrect password");
	}

	@Test
	void testPasswordResetSuccess() {
		LoginService loginService = new LoginService();

		boolean isReset = loginService.resetPassword("student@student.tus.ie", "newPass123");
		
		assertTrue(isReset, "Password reset should return true for a valid registered email");
	}
	
	@Test
	void testRequestTranscriptSuccess() {
		LoginService loginService = new LoginService();
		boolean requested = loginService.requestTranscript("student@student.tus.ie");
		
		assertTrue(requested, "Transcript request should be successful for a valid student");
	}

}
