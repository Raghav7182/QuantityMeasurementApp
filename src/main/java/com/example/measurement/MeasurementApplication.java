package com.example.measurement;

import com.example.measurement.controller.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.measurement.controller.Controller;
import com.example.measurement.repository.Repository;
import com.example.measurement.repositoryImpl.DatabaseRepository;
import com.example.measurement.serviceImpl.ServiceImpl;

@SpringBootApplication
public class MeasurementApplication {

	private static final Logger LOGGER =
			LoggerFactory.getLogger(MeasurementApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(
				MeasurementApplication.class,
				args
		);

		Repository repository =
				new DatabaseRepository();

		var service =
				new ServiceImpl(repository);

		var controller =
				new Controller(service);

		// Example
		var result = controller.performAdd(
				new com.example.measurement.dto.QuantityDTO(
						1.0,
						"FEET",
						"LENGTH"
				),
				new com.example.measurement.dto.QuantityDTO(
						12.0,
						"INCH",
						"LENGTH"
				),
				"FEET"
		);

		LOGGER.info(
				"Result Value: {}",
				result.getValue()
		);
	}
}