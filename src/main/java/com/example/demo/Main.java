package com.example.demo;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Tasks list
		Task task1 = new Task("Start with project", "Complete the project by the deadline", 1);
		Task task2 = new Task("Prepare presentation", "Create slides for the project presentation", 2);
		Task task3 = new Task("Add first task", "split tasks into sub-tasks", 3);	
		Task task4 = new Task("organize tasks into sections", "Complete the project ", 4);
		Task task5 = new Task("Finish project", "finished the tasks", 5);
		
		//add tasks
		TaskQueue taskQueue = new TaskQueue();
		taskQueue.addTask(task1);
		taskQueue.addTask(task2);
		taskQueue.addTask(task3);
		taskQueue.addTask(task4);
		taskQueue.addTask(task5);

		System.out.println("Tasks in queue:");
		System.out.println(taskQueue);

		Task removedTask = taskQueue.removeTask();
		System.out.println("Removed task:");
		System.out.println(removedTask);

		//adding task inside file
		TaskExecuter executor = new TaskExecuter("log.txt",true);
		
		executor.executeTask(task1);
		executor.executeTask(task2);
		executor.executeTask(task3);
		executor.executeTask(task4);
		executor.executeTask(task5);
	
		
	   	//execute based on priority
	   	TaskScheduler taskScheduler = new TaskScheduler();
	   	taskScheduler.addTask(task1);
	   	taskScheduler.addTask(task2);
	  	taskScheduler.addTask(task3);
	   	taskScheduler.addTask(task4);
	  	taskScheduler.addTask(task5);
	   	
	   	taskScheduler.executeTasks();
	   	
	   	
	 
	   	//pool of threads to execute
		TaskThreadPool threadPool=new TaskThreadPool(3);

 	    threadPool.executeTask(new Task("Task 1", "description of task1" , 5));
 	    threadPool.executeTask(new Task("Task 2", "description of task2",10));
 	    threadPool.executeTask(new Task("Task 3","description of task3", 1));
 	    threadPool.executeTask(new Task("Task 4","description of task4", 2));
 	    threadPool.executeTask(new Task("Task 5","description of task5", 3));
 	    
		threadPool.shutdown();
	   	
		//monitor task status
    	TaskMonitor taskmonitor = new TaskMonitor("log.txt", 2*1024);
    	taskmonitor.executeTask(task1);
    	taskmonitor.executeTask(task2);
    	taskmonitor.executeTask(task3);
    	taskmonitor.executeTask(task4);
    	taskmonitor.executeTask(task5);
	

	}
	

}
	
