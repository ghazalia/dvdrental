package com.example.dvdrental;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ActorRepo extends CrudRepository<Actor, Integer> {
}
