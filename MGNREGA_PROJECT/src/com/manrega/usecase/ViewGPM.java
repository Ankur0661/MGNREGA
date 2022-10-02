package com.manrega.usecase;

import java.util.List;

import com.manrega.bean.GPM;
import com.manrega.dao.GPMDao;
import com.manrega.dao.GPMDaoimpl;
import com.manrega.exception.GPMException;

public class ViewGPM {
	
	
	public static void main(String[] args) {
		
		 
		
		GPMDao dao = new GPMDaoimpl();
		
		try {
			
			List<GPM> gpms = dao.viewGpm();
			gpms.forEach(s -> {
				System.out.print("\t**********************************************************************************************\n");
				System.out.println("\t\tGPM MEMBER ID : "+s.getGpm_id());
				
				System.out.println("\t\tGPM MEMBER Name IS : "+s.getGname());
				System.out.println("\t\tGPM MEMBER WARD IS : "+s.getgWard());
				System.out.println("\t\tGPM MEMBER HAS EMPLOYEE : "+s.getgEmp());
				System.out.println("\t\tGPM MEMBER EMAIL IS : "+s.getEmail());
				System.out.println("\t\tGPM MEMBER PASSWORD IS: "+s.getPassword());
				System.out.println("\t\tGPM MEMBER PROJECT ID IS: "+s.getPoid());
				
				
				
			});
			
		}catch (GPMException e) {
			System.out.println(e.getMessage());
		}
	}

	

}
