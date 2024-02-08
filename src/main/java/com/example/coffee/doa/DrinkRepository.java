package com.example.coffee.doa;

import com.example.coffee.models.entity.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository  extends JpaRepository<Drink, Long> {
}
