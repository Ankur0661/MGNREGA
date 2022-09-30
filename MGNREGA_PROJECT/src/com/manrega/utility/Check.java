package com.manrega.utility;

import java.sql.Connection;

public class Check {

	public static void main(String[] args) {
		Connection conn= Mutility.provideConnection();
		
		
		System.out.println(conn);

	}

}
