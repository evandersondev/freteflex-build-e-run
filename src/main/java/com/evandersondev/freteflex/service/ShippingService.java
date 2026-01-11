package com.evandersondev.freteflex.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.evandersondev.freteflex.domain.ShippingCalculator;
import com.evandersondev.freteflex.enums.ShippingType;

@Service
public class ShippingService {

    private final ShippingCalculator standardCalculator;
    private final ShippingCalculator expressCalculator;

    public ShippingService(
            @Qualifier("standardShippingCalculator") ShippingCalculator standCalculator,
            @Qualifier("expressShippingCalculator") ShippingCalculator expressCalculator) {
        this.standardCalculator = standCalculator;
        this.expressCalculator = expressCalculator;
    }

    public Double calculate(ShippingType shippingType, Double distance, Double weight) {
        if (shippingType.equals(ShippingType.STANDARD)) {
            return standardCalculator.calculate(distance, weight);
        }

        if (shippingType.equals(ShippingType.EXPRESS)) {
            return expressCalculator.calculate(distance, weight);
        }

        return 0.0;
    }

}
