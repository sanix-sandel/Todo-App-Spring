package com.sanix.todosimplesecurity.repository;

import com.sanix.todosimplesecurity.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository <ToDo, String>{
}
