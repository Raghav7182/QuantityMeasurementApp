package com.example.measurement;

import com.example.measurement.enums.LengthUnit;
import com.example.measurement.model.QuantityLength;
import org.springframework.boot.SpringApplication;

public class MeasurementApplication {

	public static void main(String[] args) {

		SpringApplication.run(MeasurementApplication.class, args);


		double value1 = 1.0;
		LengthUnit unit1 = LengthUnit.FEET;

		double value3 = 12.0;
		LengthUnit unit2 = LengthUnit.INCH;

		QuantityLength quantityLength = new QuantityLength(value1,unit1);
		QuantityLength quantityLength1 = new QuantityLength(value3, unit2);

	}
}