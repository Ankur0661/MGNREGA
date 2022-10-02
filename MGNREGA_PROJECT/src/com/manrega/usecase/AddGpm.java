package com.manrega.usecase;

import java.util.Scanner;

import com.manrega.bean.GPM;
import com.manrega.dao.GPMDao;
import com.manrega.dao.GPMDaoimpl;

public class AddGpm {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter G.P.M Member Name :");
		String gname= sc.next();
		
		System.out.println("Enter G.P.M Member Ward No :");
		int gward= sc.nextInt();
		
		System.out.println("Enter Number of Employee Have G.P.M Member:");
		int gemp= sc.nextInt();
		
		System.out.println("Enter G.P.M Member Email id :");
		String email= sc.next();
		
		System.out.println("Enter G.P.M Member Password :");
		String pass= sc.next();
		
		System.out.println("Enter Project Id to Assign the project :");
		int poid= sc.nextInt();
		
		
		GPMDao dao = new GPMDaoimpl();
		
		GPM gpm = new GPM();
		
		gpm.setGname(gname);
		gpm.setgWard(gward);
		gpm.setgEmp(gemp);
		gpm.setEmail(email);
		gpm.setPassword(pass);
		gpm.setPoid(poid);
		
		String result = dao.addNewMember(gpm);
		
		System.out.println(result);
	}

}
