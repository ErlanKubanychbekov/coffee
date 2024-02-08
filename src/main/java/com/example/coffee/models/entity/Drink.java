package com.example.coffee.models.entity;

import com.example.coffee.models.enums.Status;
import jakarta.persistence.*;
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
@Entity
@Table(name = "tb_drink")
public class Drink {
//    drinkType, name, price, ingredients, size
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "created_date")
    LocalDate createdDate;
    @Column(name = "updated_date")
    LocalDate updatedDate;
    @Column(name = "status")
    Status status;
    @ManyToOne
    DrinkType drinkType;

    String name;

    int price;

    @ManyToOne
    IngredientOfDrink ingredientsId;

    int size;


}
