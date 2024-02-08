package com.example.coffee.service.impl;

import com.example.coffee.doa.IngredientRepository;
import com.example.coffee.models.dto.IngredientDto;
import com.example.coffee.models.mappers.DrinkTypeMapper;
import com.example.coffee.models.mappers.IngredientMapper;
import com.example.coffee.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class IngredientServiceImpl implements IngredientService {

    private final IngredientRepository repository;
    @Override
    public IngredientDto getById(Long id) {
        return IngredientMapper.INSTANCE.toDto( repository.getById(id));
    }
}
