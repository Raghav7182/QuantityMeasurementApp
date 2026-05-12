package com.example.measurement;

import com.example.measurement.enums.LengthUnit;
import com.example.measurement.model.QuantityLength;
import org.springframework.boot.SpringApplication;

public class MeasurementApplication {

	public static void main(String[] args) {

		SpringApplication.run(MeasurementApplication.class, args);


		QuantityLength q1 = new QuantityLength(2.0, LengthUnit.CENTIMETERS);
		QuantityLength q2 = new QuantityLength(2.0, LengthUnit.YARDS);

		System.out.println(q1.equals(q2));
	}
}