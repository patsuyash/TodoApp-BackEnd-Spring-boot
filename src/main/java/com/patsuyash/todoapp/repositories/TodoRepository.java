package com.patsuyash.todoapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.patsuyash.todoapp.models.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}