package com.example.measurement.enums;

public enum LengthUnit implements IMeasurable{
    FEET(1.0),
    INCH(1.0 / 12),
    YARDS(3.0),
    CENTIMETERS(0.0328084);

    private final double toFeetFactor;

    LengthUnit(double toFeetFactor) {
        this.toFeetFactor = toFeetFactor;
    }

    public double toFeet(double value) {
        return value * toFeetFactor;
    }

    public double fromFeet(double value) {
        return value / toFeetFactor;
    }

    @Override
    public double getConversionFactor() {
        return toFeetFactor;
    }

    @Override
    public double convertToBaseUnit(double value) {
        validate(value);
        return value * toFeetFactor;
    }

    @Override
    public double convertFromBaseUnit(double value) {
        validate(value);
        return value / toFeetFactor;
    }

    private void validate(double value) {
        if (!Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid value");
        }
    }
}
