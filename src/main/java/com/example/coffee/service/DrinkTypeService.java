package com.example.coffee.service;

import com.example.coffee.models.dto.DrinkTypeDto;

public interface DrinkTypeService {
    void save(DrinkTypeDto dto);

    DrinkTypeDto getById(Long id);
}
