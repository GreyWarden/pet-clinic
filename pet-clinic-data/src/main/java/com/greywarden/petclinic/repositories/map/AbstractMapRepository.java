package com.greywarden.petclinic.repositories.map;

import com.greywarden.petclinic.models.BaseEntity;

import java.util.*;

public abstract class AbstractMapRepository<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null && object.getId() == null) {
            object.setId(this.getNextId());
        } else {
            throw new RuntimeException("An object is not being passed here");
        }

        map.put(object.getId(), object);

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId;

        try {
            nextId = Collections.max(this.map.keySet()) + 1;
        } catch (NoSuchElementException exception) {
            nextId = 1L;
        }

        return nextId;
    }
}
