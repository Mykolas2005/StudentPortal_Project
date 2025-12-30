package ie.tus.portal;

public class LoginService {

	// Using constants to avoid "Magic Strings"
	private static final String VALID_EMAIL = "student@student.tus.ie";
	private static final String VALID_PASSWORD = "password123";

	public boolean login(String studentEmail, String studentPassword) {
		return VALID_EMAIL.equals(studentEmail) && VALID_PASSWORD.equals(studentPassword);
	}

	/**
	 * Implementation for Password Reset.
	 * Returns true if the email exists in our records.
	 */
	public boolean resetPassword(String email, String newPassword) {
		if (VALID_EMAIL.equals(email)) {
			return true;
		}
		return false;
	}

	/**
	 * implementation for Request Transcript.
	 * Returns true if the email belongs to a valid student.
	 */
	public boolean requestTranscript(String email) {
		if (VALID_EMAIL.equals(email)) {
			return true;
		}
		return false;
	}
}