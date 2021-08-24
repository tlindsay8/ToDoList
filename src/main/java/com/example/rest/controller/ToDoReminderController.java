package com.example.rest.controller;

import com.example.rest.Response.ToDo;
import com.example.rest.Service.ToDoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/todo")
public class ToDoReminderController {

    @PostMapping(value = "/{task}", produces = "application/json")
    public ToDo postTask(@PathVariable String task) {
        ToDoService toDoService = new ToDoService();
        return toDoService.addTask(task);
    }
}
