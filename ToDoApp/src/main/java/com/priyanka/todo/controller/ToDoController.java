package com.priyanka.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyanka.todo.Service.ToDoService;
import com.priyanka.todo.model.ToDo;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("todo")
public class ToDoController {

	@Autowired
	private ToDoService toDoService;
	
	@PostMapping("/addItem")
	public ToDo addToDoNote(@RequestBody ToDo toDo)
	{
		return toDoService.addToDoNote(toDo);
	}
	
	@PutMapping("/update/{id}")
	public String updateToDoNote(@PathVariable Long id, @RequestBody ToDo toDo)
	{
		return toDoService.updateToDoNote(toDo);
	}
	
	@GetMapping("/getAllList/{title}")
	public List<ToDo> getAllByTitle(@PathVariable String title)
	{
		return toDoService.getAllByTitle(title);
	}
	
	@GetMapping("/getAllList")
	public List<ToDo> getAllToDoList()
	{
		return toDoService.getAllToDoList();
	}
	
	@DeleteMapping("/deletedNote/{id}")
	public Void deleteToDoItem(@PathVariable Long id)
	{
		return toDoService.deleteToDoNoteById(id);
	}
	
	@GetMapping("/getTodo/{id}")
	public ToDo getTodoById(@PathVariable Long id)
	{
		return toDoService.getTodoById(id);
	}

}
