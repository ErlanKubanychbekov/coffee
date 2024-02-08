package com.example.coffee.service.impl;

import com.example.coffee.doa.DrinkTypeRepository;
import com.example.coffee.models.dto.DrinkTypeDto;
import com.example.coffee.models.mappers.DrinkTypeMapper;
import com.example.coffee.service.DrinkTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DrinkTypeServiceImpl implements DrinkTypeService {
    private final DrinkTypeRepository repository;
    @Override
    public void save(DrinkTypeDto dto) {
        repository.save(DrinkTypeMapper.INSTANCE.toEntity(dto));

    }

    @Override
    public DrinkTypeDto getById(Long id) {
        return DrinkTypeMapper.INSTANCE.toDto( repository.getById(id));
    }
}
