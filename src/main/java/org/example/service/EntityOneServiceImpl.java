package org.example.service;

import org.example.model.EntityOne;
import org.example.repository.EntityOneRepository;
import org.springframework.stereotype.Service;

@Service
public class EntityOneServiceImpl implements EntityOneService {

    private final EntityOneRepository entityOneRepository;

    public EntityOneServiceImpl(EntityOneRepository entityOneRepository) {
        this.entityOneRepository = entityOneRepository;
    }

    @Override
    public EntityOne save(EntityOne entityOne) {
        return entityOneRepository.save(entityOne);
    }
}
