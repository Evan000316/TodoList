package com.exercise.todolist.Controller;


import com.exercise.todolist.entity.Todo;
import com.exercise.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService; ////取得Service物件

    @GetMapping("/todos")
    public Iterable<Todo> getTodoList() {
        Iterable<Todo> todoList = todoService.getTodos();
        return todoList;
    }
}
