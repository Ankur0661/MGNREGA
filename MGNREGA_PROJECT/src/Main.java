import java.util.Scanner;

import com.manrega.dao.ProjectDao;
import com.manrega.dao.ProjectDaoimpl;
import com.manrega.usecase.AddGpm;
import com.manrega.usecase.CreateProject;
import com.manrega.usecase.Find;
import com.manrega.usecase.GpmLogin;
import com.manrega.usecase.ViewGPM;
import com.manrega.usecase.ViewProjects;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("\n\t*************************************MNGREGA-Sytem********************************************\n");
		Scanner sc=new Scanner(System.in);
		CreateProject n = new CreateProject();
		ViewProjects v = new ViewProjects();
		AddGpm a = new AddGpm();
		ViewGPM av = new ViewGPM();
		GpmLogin ll  = new GpmLogin();
		Find ff = new Find();
		boolean check = false;
		
		while(true)
		{
	        System.out.print("\t**********************************************************************************************\n");
	        System.out.print("\t*                                                                                            *\n");
	        System.out.print("\t*                                    1. B.D.O - LOGIN                                        *\n");
	        System.out.print("\t*                                                                                            *\n");
	        System.out.print("\t*                                    2. Gram Panchayat member - LOGIN                        *\n");
	        System.out.print("\t*                                                                                            *\n");
	        System.out.print("\t*                                    3. Exit                                                 *\n");
	        System.out.print("\t*                                                                                            *\n");
	        System.out.print("\t**********************************************************************************************\n");	
	        int choice = sc.nextInt();
		
	        switch (choice)
		
	        {
				case 1:  // BDO portal
				{
				boolean check2 = false;
				System.out.println("\n\t************************************ Welcome to B.D.O Portal *********************************\n");
				
				String un;
		    	String pd;
		    	System.out.print("Enter Your USERNAME-->");un=sc.next();
		    	System.out.print("Enter YourPassword-->");pd=sc.next();
		    	if((un.compareTo("abc")==0&&pd.compareTo("1234")==0))
		    	{
		    		while(true)
		    		{
		    	        System.out.print("\t**********************************************************************************************\n");
		    	        System.out.print("\t*                                                                                            *\n");
		    	        System.out.print("\t*                  1. Create Project.                                                        *\n");
		    	        System.out.print("\t*                  2. View Project                                                           *\n");
		    	        System.out.print("\t*                  3. Create G.P.M Members                                                   *\n");
		    	        System.out.print("\t*                  4. View G.P.M Members                                                     *\n");
		    	        System.out.print("\t*                  5. LOGOUT                                                                 *\n");
		    	        System.out.print("\t**********************************************************************************************\n");	
		    			int ch=sc.nextInt();
		    			
		    			switch(ch)
		    			{
		    				case 1:
		    				{
		    					/*To Create new Project*/
		    					n.main(null);
		    					break;
		    				}
		    				case 2:
		    				{
		    					/*To view all Project Detail*/
		    					System.out.println("\n\t*************************************MNGREGA-PROJECTS*****************************************\n");
		    					v.main(null);
		    					break;
		    				}
		    				case 3:
		    				{
		    					/*Create G.P.M Members*/
		    					a.main(null);
		    					
		    					break;
		    				}
		    				case 4:
		    				{
		    					/*View G.P.M Members*/
	    					av.main(null);
		    					
		    					break;
		    				}
		    				case 5:
		    				{
	    					  //Appointments
		    					check2 = true;
		    					break;
		    				}
		    				
		    				default:
		    				{
		    					System.out.println("Please Choose An Appropriate Option!!!");
		    				}
		    			}//end of switch
		    			if(check2)
		    				break;
		    		}//end of while
		    		
		    	}
		    	else
		    		System.out.println("Invalid Username or Password");
		    	break;
		    	}
			
			/***********************************************************************************************/ 
			
			
			 case 2:   //For GPM Members login
			 {
				 if(ll.main(null)) {
					 
					 boolean check2 = false;
					 while(true)
					 {
						    System.out.print("\t**********************************************************************************************\n");
			    	        System.out.print("\t*                  1. Show No. of Employee                                                                          *\n");
			    	        
			    	        System.out.print("\t*                  2. Total Salary                                                           *\n");
			    	        System.out.print("\t*                  3. LOGOUT                                                                 *\n");
			    	        System.out.print("\t**********************************************************************************************\n");	
			    			int ch=sc.nextInt();
			    			
			    			switch(ch)
			    			{
			    			case 1:
		    				{
		    					/*To Create new Project*/
		    					
		    					ll.checks(ch);
		    					
		    					break;
		    				}
		    				case 2:
		    				{
		    					/*To view all Project Detail*/
		    					ll.total(ch);
		    					
		    					
		    					break;
		    				}
		    				case 3:
		    				{
		    					/*Create G.P.M Members*/
		    					check2 = true;
		    					break;
		    				}
		    				default:
		    				{
		    					System.out.println("Please Choose An Appropriate Option!!!");
		    				}
		    				
			    		}
			    		if(check2)
			    		break;
			    		
					 }
				 }
				 else
				 {
					 System.out.println("Invalid Username or Password");
				 }
				 break;
			 }
			 case 3:
			    {
			    	System.out.println("**THANKS FOR VISITING US - Have A Nice Day**");
			    	check = true;
			    	break;
			    }
			 
			 
			 default :
			    {
			    	System.out.println("** PLEASE CHOOSE AN APPROPRIATE OPTION **");
			    }
			
		    }
		 	if(check)
		 		break;
			}
		  }
	   }
		
		
	
	

	


