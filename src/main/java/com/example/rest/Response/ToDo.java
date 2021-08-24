package com.example.rest.Response;

import java.util.Date;

public class ToDo {
    int taskNumber;
    String task;
    Date dateOfAssignment;

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getDateOfAssignment() {
        return dateOfAssignment;
    }

    public void setDateOfAssignment(Date dateOfAssignment) {
        this.dateOfAssignment = dateOfAssignment;
    }


}
