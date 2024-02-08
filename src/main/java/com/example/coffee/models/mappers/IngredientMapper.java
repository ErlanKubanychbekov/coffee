package com.example.coffee.models.mappers;

import com.example.coffee.models.dto.IngredientDto;
import com.example.coffee.models.entity.Ingredient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface IngredientMapper extends BaseMapper<Ingredient, IngredientDto>{
    IngredientMapper INSTANCE = Mappers.getMapper(IngredientMapper.class);
}
