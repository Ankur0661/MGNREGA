package com.manrega.usecase;

import java.util.Scanner;

import com.manrega.bean.Project;
import com.manrega.dao.ProjectDao;
import com.manrega.dao.ProjectDaoimpl;

public class CreateProject {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Project Name:");
		String pname= sc.next();
		
		System.out.println("Enter Project Valution:");
		int valuation= sc.nextInt();
		
		System.out.println("Enter Employee Need for this Project:");
		int empNeed= sc.nextInt();
		
		System.out.println("Enter Time Duration to Complete the Project in Year:");
		int duration= sc.nextInt();
		
		
		ProjectDao dao = new ProjectDaoimpl();
		
		Project project = new Project();
		
		project.setPname(pname);
		project.setValuation(valuation);
		project.setEmpNeed(empNeed);
		project.setDuration(duration);
		
		
		String result = dao.createNewProject(project);
		
		System.out.println(result);
		
	}

}
