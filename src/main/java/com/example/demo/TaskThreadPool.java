package com.example.demo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskThreadPool{
	//The ExecutorService used to maintain a pool of threads and assigns tasks
	 private ExecutorService executorService;
	 
	 	    public TaskThreadPool(int numThreads) {
	 	        executorService = Executors.newFixedThreadPool(numThreads);
	 	    }
	 
	 	    public void executeTask(Task task) {
	 	        executorService.execute(new TaskThread(task));
	 	    }
	 
	 	    public void shutdown() {
	 	        executorService.shutdown();
	 	    }
	 	
	 public static void main(String[] args) {
	 	
	 	    TaskThreadPool threadPool = new TaskThreadPool(3);
	 
	 	    threadPool.executeTask(new Task("Task 1", "description of task1" , 5));
	 	    threadPool.executeTask(new Task("Task 2", "description of task2",10));
	 	    threadPool.executeTask(new Task("Task 3","description of task3", 1));
	 	    threadPool.executeTask(new Task("Task 4","description of task4", 2));
	 	    threadPool.executeTask(new Task("Task 5", "description of task5", 3));
	 
	 	    threadPool.shutdown();
	 }
}
	
	
