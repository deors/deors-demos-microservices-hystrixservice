package deors.demos.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
