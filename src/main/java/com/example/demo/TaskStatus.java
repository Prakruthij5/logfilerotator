package com.example.demo;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class TaskStatus {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean success;

    public TaskStatus() {
        this.startTime = LocalDateTime.now();
        this.success = true;
    }

    public void markFailure() {
        this.success = false;
    }

    public void markSuccess() {
        this.success = true;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    
    public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "TaskStatus{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", success=" + success +
                '}';
    }
}


