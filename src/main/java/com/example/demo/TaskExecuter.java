package com.example.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskExecuter{
	
    private String logFilePath;
    private boolean appendToFile;

    public TaskExecuter(String logFilePath, boolean appendToFile) {
        this.logFilePath = logFilePath;
        this.appendToFile = appendToFile;
        
    }
 
        public void execute(Task task) {
            // execute task
            System.out.println("Executing task: " + task.getTaskName());
        }
    

//write tasks inside a file
    public void executeTask(Task task) {
        try {
            FileWriter fileWriter = new FileWriter(logFilePath, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(task.toString());
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


	
	
	
