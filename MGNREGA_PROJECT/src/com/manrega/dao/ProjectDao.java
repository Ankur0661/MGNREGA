package com.manrega.dao;

import java.util.List;

import com.manrega.bean.Project;
import com.manrega.exception.ProjectException;

public interface ProjectDao {
	
	public String createNewProject(Project project);
	
	public List<Project> viewProjects()throws ProjectException;

}
