package com.example.dvdrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ActorController {
    @Autowired
    private ActorRepo actorRepo;

    @GetMapping("/actor")
    public List<Actor> listAllActors()
    {
        List<Actor> actors = new ArrayList<>();
        actorRepo.findAll().forEach( actor -> actors.add(actor));

        return actors;
    }



    @GetMapping("actor/film/{actorId}")
    public int numberOfFilmsByActorId(@PathVariable Integer actorId) {
       Actor actor = actorRepo.findByActorId( actorId);
       return actor.getFilm().size();
    }

}
