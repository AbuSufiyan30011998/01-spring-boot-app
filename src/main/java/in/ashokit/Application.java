package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


	public static void m1(){
		System.out.println("m1  ");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
