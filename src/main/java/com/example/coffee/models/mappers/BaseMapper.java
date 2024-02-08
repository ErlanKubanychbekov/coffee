package com.example.coffee.models.mappers;

import java.util.List;

public interface BaseMapper<E, D> {

    E toEntity(D d);

    D toDto(E e);

    List<E> toEntities(List<D> dtos);

    List<D> toDtos(List<E> entities);
}
