package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("from COmmandLine Runner");
		
		System.out.println("this is my first runner");
		
		System.out.println("this is my first runner");

	}

}
