package com.example.demo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskScheduler{

	    private PriorityQueue<Task> taskQueue;
	
	    
	    public TaskScheduler() {
	        taskQueue = new PriorityQueue<>(Comparator.comparing(Task::getPriority).reversed());;
	    }

	    //execute based on priority
	    public void addTask(Task task) {
	        taskQueue.add(task);
	    }


	    public void executeTasks() {
	    	
	        while (!taskQueue.isEmpty()) {
	            Task task = taskQueue.poll();
	            task.execute();
	        }
	    }
	    
}
	
