package com.example.demo;

import java.util.Date;

public class Task  {
    private String taskName;
    private String description;
    private int priority;
    private Date dateCreated;
    private TaskStatus status;

    public Task(String taskName, String description, int priority) {
        this.taskName = taskName;
        this.description = description;
        this.priority = priority;
        this.dateCreated = new Date();
        this.status=status;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public String toString() {
        return "Task Name: " + taskName + "\n" +
                "Description: " + description + "\n" +
                "Priority: " + priority + "\n" +
                "Date Created: " + dateCreated + "\n";
    }
    
    public void execute() {
        System.out.println("Executing task: " + taskName +" ,"+ description +" ,"+ priority);
    }


}

