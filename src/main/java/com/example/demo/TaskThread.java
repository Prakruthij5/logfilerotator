package com.example.demo;

import java.io.FileWriter;
import java.io.IOException;

	public class TaskThread extends Thread {
	    private Task task;

	    public TaskThread(Task task) {
	        this.task = task;
	    }

	    public void run() {
	        TaskExecuter taskExecutor = null;
			taskExecutor = new TaskExecuter("log.txt",true);
	        taskExecutor.execute(task);

	        // write task to file
	        try (FileWriter writer = new FileWriter("log.txt", true)) {
	            writer.write("Task Name: " + task.getTaskName() + "\n");
	            writer.write("Description: " + task.getDescription() + "\n");
	            writer.write("Priority: " + task.getPriority() + "\n");
	            writer.write("\n");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


 
