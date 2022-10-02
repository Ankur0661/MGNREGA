package com.manrega.usecase;

import java.util.Scanner;

import com.manrega.bean.GPM;
import com.manrega.dao.GPMDao;
import com.manrega.dao.GPMDaoimpl;
import com.manrega.exception.GPMException;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your Email To Find Your No. Of Employee : ");
		
		String uname = sc.next();
		
		GPMDao dao = new GPMDaoimpl();
		
		try {
			GPM gp = dao.NoEmp(uname);
			
			System.out.println("Welcome : "+gp.getgEmp());
		} catch (GPMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
