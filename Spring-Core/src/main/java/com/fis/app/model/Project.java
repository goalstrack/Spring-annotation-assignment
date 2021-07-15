package com.fis.app.model;

import java.io.Serializable;
import java.util.Objects;

public class Project implements Serializable{
	private int pid;
	private String pname;
	
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Project(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(pid, pname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return pid == other.pid && Objects.equals(pname, other.pname);
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + "]";
	}
	
}
