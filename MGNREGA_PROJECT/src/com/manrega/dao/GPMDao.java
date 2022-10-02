package com.manrega.dao;

import java.util.List;

import com.manrega.bean.GPM;
import com.manrega.bean.Project;
import com.manrega.exception.GPMException;
import com.manrega.exception.ProjectException;

public interface GPMDao {
	
	public String addNewMember(GPM gpm);
	
	public List<GPM> viewGpm() throws GPMException;
	
	public GPM login(String email, String psw) throws GPMException;
	
	public GPM NoEmp(String email)throws GPMException;

}
