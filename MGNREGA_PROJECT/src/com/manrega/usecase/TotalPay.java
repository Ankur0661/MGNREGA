package com.manrega.usecase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.manrega.utility.Mutility;

public class TotalPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your Email :");
		String em= sc.next();
		
		int sal = 300;
		
		try(Connection conn = Mutility.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement
					("select gEmp from gpmm where email = ?");	
			
			ps.setString(1, em);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				int m= rs.getInt("gEmp");
				
				System.out.println("Total Amount to Pay Employee Daily is :"+m*sal);

			}else {
			
					System.out.println("Record does not exist with This Email "+em);
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
