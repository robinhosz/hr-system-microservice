package br.com.rbn.payrollapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PayrollapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollapiApplication.class, args);
	}

}
