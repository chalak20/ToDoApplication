package com.priyanka.todo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyanka.todo.model.ToDo;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

	List<ToDo> findAllByTitle(String title);

}
