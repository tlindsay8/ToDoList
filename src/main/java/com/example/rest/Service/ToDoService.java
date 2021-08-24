package com.example.rest.Service;

import com.example.rest.Response.ToDo;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ToDoService {
    public ToDo addTask(String newTask) {
        ToDo toDo = new ToDo();
        Date taskDate = new Date();

        toDo.setTask(newTask);
        toDo.setTaskNumber(toDo.getTaskNumber() + 1);
        toDo.setDateOfAssignment(taskDate);

        return toDo;
    }

}
