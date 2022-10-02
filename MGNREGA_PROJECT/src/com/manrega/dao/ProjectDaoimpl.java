package com.manrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manrega.bean.Project;
import com.manrega.exception.ProjectException;
import com.manrega.utility.Mutility;

public class ProjectDaoimpl implements ProjectDao {

	@Override
	public String createNewProject(Project project) {
		
		String message = "Project Not created..";
		
		try(Connection conn = Mutility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement
					("insert into Projects(pname,valuation,empNeed,duration) values(?,?,?,?)");
			
			
			
			ps.setString(1, project.getPname());
			ps.setInt(2, project.getValuation());
			ps.setInt(3, project.getEmpNeed());
			ps.setInt(4, project.getDuration());
			
			
			
			int x = ps.executeUpdate();
			
			if(x > 0)
				message = "Project Created Sucessfully !";
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return message;
		
		
	}

	@Override
	public List<Project> viewProjects() throws ProjectException {
		
		List<Project> projects = new ArrayList<>();
		
		
		try(Connection conn = Mutility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from Projects");
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int i = rs.getInt("pid");
				String p = rs.getString("pname");
				int v = rs.getInt("valuation");
				int n = rs.getInt("empNeed");
				int d = rs.getInt("duration");
				
				
				Project project = new Project(i, p, v, n, d);
				
				projects.add(project);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ProjectException(e.getMessage());
		}
		
		if(projects.size() == 0)
			throw new ProjectException("No Project found..");
		
		
		
		return projects;
	}
	
	

}
