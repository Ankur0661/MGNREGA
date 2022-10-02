package com.manrega.bean;

public class GPM {
	
	private int gpm_id;
	private String gname;
	private int gWard;
	private int gEmp;
	private String email;
	private String password;
	private int poid;
	
	
	public GPM() {
		// TODO Auto-generated constructor stub
	}


	public GPM(int gpm_id, String gname, int gWard, int gEmp, String email, String password, int poid) {
		super();
		this.gpm_id = gpm_id;
		this.gname = gname;
		this.gWard = gWard;
		this.gEmp = gEmp;
		this.email = email;
		this.password = password;
		this.poid = poid;
	}


	public int getGpm_id() {
		return gpm_id;
	}


	public void setGpm_id(int gpm_id) {
		this.gpm_id = gpm_id;
	}


	public String getGname() {
		return gname;
	}


	public void setGname(String gname) {
		this.gname = gname;
	}


	public int getgWard() {
		return gWard;
	}


	public void setgWard(int gWard) {
		this.gWard = gWard;
	}


	public int getgEmp() {
		return gEmp;
	}


	public void setgEmp(int gEmp) {
		this.gEmp = gEmp;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getPoid() {
		return poid;
	}


	public void setPoid(int poid) {
		this.poid = poid;
	}


	@Override
	public String toString() {
		return "GPM [gpm_id=" + gpm_id + ", gname=" + gname + ", gWard=" + gWard + ", gEmp=" + gEmp + ", email=" + email
				+ ", password=" + password + ", prid=" + poid + "]";
	}


	
	
	
	

}
