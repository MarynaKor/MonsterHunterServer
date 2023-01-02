package com.example.monsterhunterserver;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface ScoresRepository extends CrudRepository<newUser, Integer> {

    Iterable<newUser> findAll(Sort highScore);
}
