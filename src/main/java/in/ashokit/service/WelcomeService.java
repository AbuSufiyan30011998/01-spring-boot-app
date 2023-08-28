package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	
	public String getMessage() {
		
		String msg="Welcome to ashokit..";
		return msg;
	}

}
