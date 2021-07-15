package com.fis.app.model;



import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee implements Serializable,Comparable<Employee> {
	@Value("${emp.eid}")
	private int Eid;
	
	@Value("${emp.ename}")
	private String Ename;
	
	@Value("${emp.department}")
	private String department;
	
	@Value("${emp.salary}")
	private int salary;
	
	@Autowired
	private Project p;
	@Autowired
	private List<Task> t;
	
	public Employee() {
		super();
		System.out.println("Constructor Called");
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int eid, String ename, String department, int salary, Project p,List<Task> t) {
		super();
		Eid = eid;
		Ename = ename;
		this.department = department;
		this.salary = salary;
		this.p = p;
		this.t=t;
		
	}
	
	public Employee(int eid, String ename, String department, int salary) {
		super();
		Eid = eid;
		Ename = ename;
		this.department = department;
		this.salary = salary;
	}

	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	

	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Project getP() {
		return p;
	}

	public void setP(Project p) {
		this.p = p;
	}

	
	public List<Task> getT() {
		return t;
	}

	public void setT(List<Task> t) {
		this.t = t;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Eid, Ename, department, p, salary, t);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Eid == other.Eid && Objects.equals(Ename, other.Ename) && Objects.equals(department, other.department)
				&& Objects.equals(p, other.p) && salary == other.salary && Objects.equals(t, other.t);
	}

	@Override
	public String toString() {
		if(p==null&&t==null)
			return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", department=" + department + ", salary=" + salary
					 + "]";
			
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", department=" + department + ", salary=" + salary
					+ ", p=" + p + ", t=" + t + "]";
			
	}
	
	

	//spring lifecycle methods
	public void doInIt()
	{
		System.out.println(" do init called ");
		
		
	}
	
	
	
	@Override
	public int compareTo(Employee emp) {
			return this.Ename.compareTo(emp.Ename);
	}


	public void doDestroy()
	{
		System.out.println(" do destroy  called ");
		/*PrintWriter pw;
		try {
			/*pw = new PrintWriter(f2);
			pw.print(this);
			
			pw.close()
			FileOutputStream fos = new FileOutputStream(f2);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);  // List<Account>
			System.out.println("------File writing done");
			oos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}
	
}
