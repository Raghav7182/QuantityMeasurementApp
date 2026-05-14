package com.example.measurement.repository;

import com.example.measurement.entity.Entity;

import java.util.ArrayList;
import java.util.List;
public class CacheRepository implements Repository {

    private static CacheRepository instance;

    private final List<Entity> cache = new ArrayList<>();

    private CacheRepository() {
    }

    public static CacheRepository getInstance() {
        if (instance == null) {
            instance = new CacheRepository();
        }
        return instance;
    }

    @Override
    public void save(Entity entity) {
        cache.add(entity);
    }
}
