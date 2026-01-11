package com.evandersondev.freteflex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evandersondev.freteflex.controller.dto.ShippingResponse;
import com.evandersondev.freteflex.enums.ShippingType;
import com.evandersondev.freteflex.service.ShippingService;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    @GetMapping("/calculate")
    public ResponseEntity<ShippingResponse> calculate(
            @RequestParam("type") ShippingType shippingType,
            @RequestParam("distance") Double distance,
            @RequestParam("weight") Double weight) {

        var cost = shippingService.calculate(shippingType, distance, weight);
        return ResponseEntity.ok(new ShippingResponse(cost));
    }

}
