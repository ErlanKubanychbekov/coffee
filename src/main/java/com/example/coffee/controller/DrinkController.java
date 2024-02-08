package com.example.coffee.controller;

import com.example.coffee.models.entity.Drink;
import com.example.coffee.models.request.DrinkCreateRequest;
import com.example.coffee.service.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/drink")
@RequiredArgsConstructor
public class DrinkController {
    private final DrinkService service;
    @PostMapping
    public Drink save(DrinkCreateRequest request){
        return service.save(request);
    }
}
