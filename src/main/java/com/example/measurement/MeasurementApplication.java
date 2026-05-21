package com.example.measurement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"QuantityMeasurementApp",
		"com.example.measurement"
})
@EntityScan("com.example.measurement.entity")
@EnableJpaRepositories("com.example.measurement.repository")
public class MeasurementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeasurementApplication.class, args);
	}
}