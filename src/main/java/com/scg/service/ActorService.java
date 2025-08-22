package com.scg.service;

import com.scg.model.ActorEntity;

import java.util.List;
import java.util.Optional;

/**
 * @author : gschamika
 */
public class ActorService {
    private final ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<ActorEntity> getAllActors() {
        return actorRepository.findAll();
    }

    public Optional<ActorEntity> getActorById(Long id) {
        return actorRepository.findById(id);
    }

    public ActorEntity saveActor(ActorEntity actor) {
        return actorRepository.save(actor);
    }

    public void deleteActor(Long id) {
        actorRepository.deleteById(id);
    }
}
