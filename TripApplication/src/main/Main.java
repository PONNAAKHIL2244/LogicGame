package main;
import java.util.Scanner;

import serviceUtil.Service;
import util.Util;


public class Main {
public static void main(String args[]) throws Exception
{
	System.out.println("Welcome to Bla-Bla Car Application\n\tYour Ride and Your Choice");
	String Nationality=Util.enterString("Plz tell us,Your Foreign or Native");
	
	Scanner sc=new Scanner(System.in);
 	String services="1.Find Ride\n"+"2.Offer Ride\n"+"3.About Us\n"+"0.Quit\n";
	while(true)
	{
     String Information=" ";
     if(Nationality.equalsIgnoreCase("Foreign"))
     {
    	 Information=Util.enterString("Enter Your passport Id:");
    	 System.out.println("Checking passpord id for:"+Information);
         Thread.sleep(2000);
         System.out.println("Process Completed Sucessfully");
         
                 
     }
     else if(Nationality.equalsIgnoreCase("Native"))
     {
    	 
     }
     else {
    	 System.out.println("Invalid");
    	 break ;
     }
     
     System.out.println(services);
     int menu=sc.nextInt();
     
     if(menu==1)
     {
    	Service.menu1();
    	break;
    	 
     }
     else if(menu==2)
     {
    	Service.menu2();
    	 break;
     }
     else if(menu==3)
     {
    	Service.main3();
    	break;
     }
     else if(menu==0)
     {
    	 System.out.println("Quiting");
    	 break;
     }
     else
     {
    	 System.out.println("Invalid Operator");
    	 continue;
     }
     

}
	sc.close();
}
}
