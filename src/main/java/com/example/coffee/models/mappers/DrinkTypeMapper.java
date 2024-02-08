package com.example.coffee.models.mappers;

import com.example.coffee.models.dto.DrinkDto;
import com.example.coffee.models.dto.DrinkTypeDto;
import com.example.coffee.models.entity.Drink;
import com.example.coffee.models.entity.DrinkType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DrinkTypeMapper extends BaseMapper<DrinkType, DrinkTypeDto>{
    DrinkTypeMapper INSTANCE = Mappers.getMapper(DrinkTypeMapper.class);
}
