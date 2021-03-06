package com.orhanararat.controller;

import com.orhanararat.configuration.ApplicationParameters;
import com.orhanararat.model.Limits;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {
    private final ApplicationParameters configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
//        return new Limits(1, 1000);
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }

}
