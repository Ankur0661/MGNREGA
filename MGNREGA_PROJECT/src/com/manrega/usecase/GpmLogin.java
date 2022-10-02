package com.manrega.usecase;

import java.util.Scanner;

import com.manrega.bean.GPM;
import com.manrega.dao.GPMDao;
import com.manrega.dao.GPMDaoimpl;
import com.manrega.exception.GPMException;

public class GpmLogin {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your Email:");
		String uname = sc.next();
		
		System.out.println("Enter Your Password:");
		String pass = sc.next();
		
		GPMDao dao = new GPMDaoimpl();
		
		try {
			GPM gpm = dao.login(uname, pass);
			
			checks(gpm.getgEmp());
			total(gpm.getgEmp());
			
			flag = true;
			
//			System.out.println("Welcome : "+gpm.getGname());
			
			return true;
		} catch (GPMException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
//			e.printStackTrace(); 
		}
		return flag;

	}
	
	public static void checks(int n) {
		if(n>0) {
			System.out.println("No. Of Employee is : "+ n);
			
		}
		
	}
	public static void total(int x) {
		if(x>0) {
			System.out.println("Total Salary of Employee is : "+ x*350);
			
		}
		
	}
	

}
