package com.example.coffee.models.entity;

import com.example.coffee.models.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "tb_drink_type")
public class DrinkType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "created_date")
    LocalDate createdDate;
    @Column(name = "updated_date")
    LocalDate updatedDate;
    @Column(name = "status")
    Status status;

    String name;
}
