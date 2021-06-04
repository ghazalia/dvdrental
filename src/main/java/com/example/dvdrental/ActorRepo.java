package com.example.dvdrental;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
interface ActorRepo extends PagingAndSortingRepository<Actor, Integer> {
    @Query("Select a from Actor a where a.actor_id = ?1")
    Actor findByActorId(Integer actorId);


}
