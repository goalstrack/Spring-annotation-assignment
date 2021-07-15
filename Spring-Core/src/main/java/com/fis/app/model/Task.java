package com.fis.app.model;

import java.io.Serializable;
import java.util.Objects;

public class Task implements Serializable {
	private int taskid;
	private String taskName;
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int taskid, String taskName) {
		super();
		this.taskid = taskid;
		this.taskName = taskName;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(taskName, taskid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(taskName, other.taskName) && taskid == other.taskid;
	}
	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskName=" + taskName + "]";
	}
	

}
