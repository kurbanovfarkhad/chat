package com.example.chat.demo.mapper;

import com.example.chat.demo.entity.BaseEntity;
import com.example.chat.demo.model.BaseForm;

public interface BaseMapper<E extends BaseEntity, F extends BaseForm> {
    E modelToEntity(F form);
    F entityToModel(E entity);
}
