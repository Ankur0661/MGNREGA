package com.manrega.usecase;

import java.util.List;

import com.manrega.bean.Project;
import com.manrega.dao.ProjectDao;
import com.manrega.dao.ProjectDaoimpl;
import com.manrega.exception.ProjectException;

public class ViewProjects {
	
	public static void main(String[] args) {
		
		ProjectDao dao = new ProjectDaoimpl();
		
		try {
			List<Project> projects = dao.viewProjects();
			
			projects.forEach(s -> {
				System.out.print("\t**********************************************************************************************\n");
				System.out.println("\t\tProject Name is : "+s.getPname());
				
				System.out.println("\t\tProject Valuation is : "+s.getValuation());
				System.out.println("\t\tEmployee need for this project : "+s.getEmpNeed());
				System.out.println("\t\tDuration of project : "+s.getDuration()+" Years");
				
			});
			
			
		} catch (ProjectException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
