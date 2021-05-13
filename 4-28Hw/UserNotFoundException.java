package priv.szq.base.hw4_28;
import org.apache.log4j.Logger;
public class UserNotFoundException extends Exception{
	private static final Logger logger = Logger
			.getLogger(UserNotFoundException.class);

	public UserNotFoundException(String message) {
		super(message);
	}
	
}

