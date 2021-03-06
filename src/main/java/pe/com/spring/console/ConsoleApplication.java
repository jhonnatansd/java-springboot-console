package pe.com.spring.console;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsoleApplication implements ExitCodeGenerator {
	
	public static void main(String[] args) throws Exception {
		System.exit(SpringApplication.exit(SpringApplication.run(ConsoleApplication.class, args)));
	}

	@Override
	public int getExitCode() {
		return 1;
	}


}
