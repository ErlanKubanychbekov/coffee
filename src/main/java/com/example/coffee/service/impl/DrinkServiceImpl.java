package com.example.coffee.service.impl;

import com.example.coffee.doa.DrinkRepository;
import com.example.coffee.models.dto.DrinkDto;
import com.example.coffee.models.entity.Drink;
import com.example.coffee.models.enums.Status;
import com.example.coffee.models.mappers.DrinkMapper;
import com.example.coffee.models.mappers.DrinkTypeMapper;
import com.example.coffee.models.mappers.IngredientMapper;
import com.example.coffee.models.request.DrinkCreateRequest;
import com.example.coffee.service.DrinkService;
import com.example.coffee.service.DrinkTypeService;
import com.example.coffee.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class DrinkServiceImpl implements DrinkService {
    private final DrinkRepository repository;

    @Override
    public Drink save(DrinkCreateRequest request) {
        DrinkDto entity = DrinkDto.builder()
                .createdDate(LocalDate.now())
                .drinkType( request.getDrinkTypeId())
                .status(Status.ACTIVE)
                .name(request.getName())
                .price(request.getPrice())
                .ingredientOfDrinkId(request.getIngredientOfDrinkId())
                .size(request.getSize())
                .updatedDate(null)
                .build();

        return repository.save(DrinkMapper.INSTANCE.toEntity(entity));
    }
}
