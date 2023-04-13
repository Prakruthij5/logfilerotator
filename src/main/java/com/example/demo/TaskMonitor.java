package com.example.demo;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;


	public class TaskMonitor {
	    private String filePath;
	    private int maxSize;
	  

		public TaskMonitor(String filePath, int maxSize) {
	        this.filePath = filePath;
	        this.maxSize = maxSize;
	    }
		
//check file size is greater than max file ,then create a new file with suffix increment1
	    public void checkFileSize() {
	        File file = new File(filePath);
	        long fileSize = file.length();
	        if (fileSize > maxSize) {
	            int lastIndex = filePath.lastIndexOf(".");
	            String extension = filePath.substring(lastIndex);
	            String newFilePath = filePath.substring(0, lastIndex) + "_1" + extension;
	            File newFile = new File(newFilePath);
	            int suffix = 1;
	            while (newFile.exists()) {
	                suffix++;
	                newFilePath = filePath.substring(0, lastIndex) + "_" + suffix + extension;
	                newFile = new File(newFilePath);
	            }
	            file.renameTo(newFile);
	        }
	    }
	    
	    
	   //write tasks inside task and monitor the task status with start and end time 
	    public void executeTask(Task task) throws InterruptedException {
	    	TaskStatus taskStatus=new TaskStatus();
      try {
          String logFilePath = "log.txt";
			FileWriter fileWriter = new FileWriter(logFilePath, true);
          PrintWriter printWriter = new PrintWriter(fileWriter);
       taskStatus.setStartTime(LocalDateTime.now());
          printWriter.println(task.toString());
          printWriter.close();
          
          TaskMonitor fileMonitor = new TaskMonitor(logFilePath, 1024);
          fileMonitor.checkFileSize();
          taskStatus.markSuccess();
 
          taskStatus.setEndTime(LocalDateTime.now());
      } catch (IOException e) {
    	  taskStatus.markFailure();
    	  taskStatus.setEndTime(LocalDateTime.now());
          e.printStackTrace();
      }
      System.out.println(taskStatus.toString());
  }
	    
	}

	

