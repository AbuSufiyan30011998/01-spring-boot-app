package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


	public static void m1(){
		System.out.println("m1() method...  ");
	}

	public static void m2(){
		System.out.println("m2()  ");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
