package com.example.demo;

import java.util.Comparator;
	import java.util.PriorityQueue;

	public class TaskQueue {
		// priority queue uses natural sorting order , to get based on max priority- reverse method is used
	    private PriorityQueue<Task> tasks = new PriorityQueue<>(Comparator.comparing(Task::getPriority).reversed());

	    //add tasks
	    public void addTask(Task task) {
	        tasks.offer(task);
	    }

	    public Task removeTask() {
	        return tasks.poll();
	    }

	    public boolean isEmpty() {
	        return tasks.isEmpty();
	    }

	    public int size() {
	        return tasks.size();
	    }

	    @Override
	    public String toString() {
	        StringBuilder stringBuilder = new StringBuilder();
	        for (Task task : tasks) {
	            stringBuilder.append(task).append("\n");
	        }
	        return stringBuilder.toString();
	    }
	}

	
