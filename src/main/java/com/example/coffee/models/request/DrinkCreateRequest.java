package com.example.coffee.models.request;

import com.example.coffee.models.entity.DrinkType;
import com.example.coffee.models.entity.Ingredient;
import lombok.Data;

import java.util.List;
@Data
public class DrinkCreateRequest {
    Long drinkTypeId;

    String name;

    int price;


    Long ingredientOfDrinkId;

    int size;
}
