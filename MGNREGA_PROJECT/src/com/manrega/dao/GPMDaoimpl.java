package com.manrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.manrega.bean.GPM;
import com.manrega.exception.GPMException;
import com.manrega.exception.ProjectException;
import com.manrega.utility.Mutility;

public class GPMDaoimpl implements GPMDao{

	@Override
	public String addNewMember(GPM gpm) {
		String message = "G.P.M Not created..";
		
		try(Connection conn = Mutility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement
					("insert into gpmm(gName,gWard,gEmp,email,password,poid) values(?,?,?,?,?,?)");
			
			
			ps.setString(1, gpm.getGname());
			ps.setInt(2, gpm.getgWard());
			ps.setInt(3, gpm.getgEmp());
			ps.setString(4, gpm.getEmail());
			ps.setString(5, gpm.getPassword());
			ps.setInt(6, gpm.getPoid());
			
            int x = ps.executeUpdate();
			
			if(x > 0)
				message = "G.P.M Added Sucessfully !";
			    
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return message;
	}

	@Override
	public List<GPM> viewGpm() throws GPMException {
		
		
		 List<GPM> gpms = new ArrayList<>();
		
		try(Connection conn = Mutility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from gpmm");
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				int i = rs.getInt("gpm_id");
				String n = rs.getString("gName");
				int w = rs.getInt("gWard");
				int en = rs.getInt("gEmp");
				String e = rs.getString("email");
				String p = rs.getString("password");
				int kk = rs.getInt("poid");
				
				
				GPM gpm = new GPM(i, n, w, en, e, p, kk);
				
				gpms.add(gpm);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new GPMException(e.getMessage());
		}
		if(gpms.size() == 0)
			throw new GPMException("No Member found..");
		
		return gpms;
	}

	@Override
	public GPM login(String email, String psw) throws GPMException {
		// TODO Auto-generated method stub
		
		GPM gpm = null;
		
		try(Connection conn = Mutility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from gpmm where email = ? AND password = ?");	
			ps.setString(1, email);
			ps.setString(2, psw);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				int i = rs.getInt("gpm_id");
				String n = rs.getString("gName");
				int w = rs.getInt("gWard");
				int en = rs.getInt("gEmp");
				String e = rs.getString("email");
				String p = rs.getString("password");
				int kk = rs.getInt("poid");
				
				gpm = new GPM(i, n, w, en, e, p, kk);
			}else throw new GPMException("Invalid User");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return gpm;
	}

	

}
