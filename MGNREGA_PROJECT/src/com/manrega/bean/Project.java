package com.manrega.bean;

public class Project {
	
	private int pid;
	private String pname;
	private int valuation;
	private int empNeed;
	private int duration;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	public Project(int pid, String pname, int valuation, int empNeed, int duration) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.valuation = valuation;
		this.empNeed = empNeed;
		this.duration = duration;
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

	public int getValuation() {
		return valuation;
	}

	public void setValuation(int valuation) {
		this.valuation = valuation;
	}

	public int getEmpNeed() {
		return empNeed;
	}

	public void setEmpNeed(int empNeed) {
		this.empNeed = empNeed;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", valuation=" + valuation + ", empNeed=" + empNeed
				+ ", duration=" + duration + "]";
	}
	
	
	
	

}
