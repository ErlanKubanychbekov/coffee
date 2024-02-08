package com.example.coffee.service;

import com.example.coffee.models.dto.DrinkTypeDto;
import com.example.coffee.models.dto.IngredientDto;

public interface IngredientService {

    IngredientDto getById(Long id);
}
