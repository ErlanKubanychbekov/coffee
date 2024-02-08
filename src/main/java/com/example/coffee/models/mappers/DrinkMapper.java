package com.example.coffee.models.mappers;

import com.example.coffee.models.dto.DrinkDto;
import com.example.coffee.models.entity.Drink;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DrinkMapper extends BaseMapper<Drink, DrinkDto> {
    DrinkMapper INSTANCE = Mappers.getMapper(DrinkMapper.class);
}
