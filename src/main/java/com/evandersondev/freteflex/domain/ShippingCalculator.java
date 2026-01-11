package com.evandersondev.freteflex.domain;

public interface ShippingCalculator {
    Double calculate(Double distance, Double weight);
}
