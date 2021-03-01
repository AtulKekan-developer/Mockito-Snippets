package dummy;

import com.atul.test_doubles_dummy.EmailService;

public class DummyEmailService implements EmailService{

	@Override
	public void sendEmail(String message) {
		throw new AssertionError("Method not implemented");		
	}

}
