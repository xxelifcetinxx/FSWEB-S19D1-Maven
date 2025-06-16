package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.Vegetable;

import java.util.List;

public interface VegetableService {

    List<Vegetable> getByPriceAsc();

    List<Vegetable> getByPriceDesc();

    List<Vegetable> searchByName(String name);

    Vegetable save(Vegetable Vegetable);

    Vegetable delete(Long id);

    Vegetable getById(Long id);

}
