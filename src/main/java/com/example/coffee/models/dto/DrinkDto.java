package com.example.coffee.models.dto;

import com.example.coffee.models.entity.DrinkType;
import com.example.coffee.models.entity.Ingredient;
import com.example.coffee.models.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@ToString
public class DrinkDto {

    Long id;

    LocalDate createdDate;

    LocalDate updatedDate;

    Status status;

    Long drinkType;

    String name;

    int price;


    Long ingredientOfDrinkId;

    int size;
}
