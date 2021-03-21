package Util;

import java.util.Scanner;

public class Email {
	
	
		
		private String Email;
		private String Password;
		private String department;

		

		private String setDepartment()
		{
			System.out.println("Plz enter your Department");
		    String dep=
		    		"1.History \n"+
		            "2.Engineering \n"+
		    		"3.economics\n "+
		            "4.science \n";
			System.out.println(dep);
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int intDep=sc.nextInt();
			if(intDep==1)
			{
				return "Historical";
			
			}
			else if(intDep==2)
				{
					return "Engineering";
					
				}
			else if(intDep==3)
				{
					return "Economics";
					
				}
			else if(intDep==4)
			{
				return "Science";
			}
			else{
				return " ";
			}
			
			}

		public Email(String firstname,String lastname)
		{
			this.department=setDepartment();
			this.Password=randomPassword(10);
			System.out.println("Your password: "+Password);
		Email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+this.department;	
		System.out.println("Your Email: "+Email);
		}

		private String randomPassword(int num) {
			String passwordset="PA45456554";
			char [] password=new char[10];
			for(int i=0;i<num;i++)
			{
				int rand=(int) (Math.random()*passwordset.length());
				password[i]=passwordset.charAt(rand);
				
			}
			
			return new String(password);

		}
	}
