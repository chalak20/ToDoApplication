package com.priyanka.todo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanka.todo.Repository.ToDoRepository;
import com.priyanka.todo.model.ToDo;

@Service
public class ToDoServiceImpl implements ToDoService{

	@Autowired
	private ToDoRepository toDoRepository;

	@Override
	public ToDo addToDoNote(ToDo toDo) {
		return toDoRepository.save(toDo);
	}

	@Override
	public String updateToDoNote(ToDo toDo) {
		toDoRepository.save(toDo);
		return null;
	}

	@Override
	public Void deleteToDoNoteById(Long id) {
		toDoRepository.deleteById(id);
		return null;
	}

	@Override
	public List<ToDo> getAllByTitle(String title) {
		return toDoRepository.findAllByTitle(title);
	}

	@Override
	public List<ToDo> getAllToDoList() {
		return toDoRepository.findAll();
	}

	@Override
	public ToDo getTodoById(Long id) {
		Optional<ToDo> toDo = toDoRepository.findById(id);
		return toDo.get();
		
	}

}
