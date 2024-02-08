package com.example.coffee.service;

import com.example.coffee.models.entity.Drink;
import com.example.coffee.models.request.DrinkCreateRequest;

public interface DrinkService {
    Drink save(DrinkCreateRequest request);
}
