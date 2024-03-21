package com.priyanka.todo.Service;

import java.util.List;

import com.priyanka.todo.model.ToDo;

public interface ToDoService {

	ToDo addToDoNote(ToDo toDo);
	String updateToDoNote(ToDo toDo);
	ToDo getTodoById(Long id);
	Void deleteToDoNoteById(Long id);
	List<ToDo> getAllByTitle(String title);
	List<ToDo> getAllToDoList();
}
