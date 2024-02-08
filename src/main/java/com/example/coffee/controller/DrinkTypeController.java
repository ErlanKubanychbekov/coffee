package com.example.coffee.controller;

import com.example.coffee.models.dto.DrinkTypeDto;
import com.example.coffee.models.entity.Drink;
import com.example.coffee.models.request.DrinkCreateRequest;
import com.example.coffee.service.DrinkTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/drink_type")
@RequiredArgsConstructor
public class DrinkTypeController {
    private final DrinkTypeService service;
    @PostMapping
    public void save(DrinkTypeDto dto){
        service.save(dto);
    }

}
