package util;

import java.util.Scanner;

public class Util {
	
public static String enterString(String title)
{
System.out.println(title);
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
String answer=sc.nextLine();
return answer;
}


public static int enterInteger(String title)
{
System.out.println(title);
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
int answer=sc.nextInt();
return answer;
}


public static String fillInfo()
{
	String name= enterString("Enter Your Name");    	
	 
	 String surname=enterString("Enter Your Surname");
	 
	 String email= enterString("Enter Your Email");
	 
	
	 String phoneno= enterString("Enter Your Phoneno");
	 
	 return "Name:"+name+"\n"+"Surname:"+surname+"\n"+"Email:"+email+"\n"+"Phoneno:"+phoneno;
}

public static String fillTripInfo()
{
	 
	 String location=enterString("Enter Your Location");
	 int passenger=enterInteger("How many passengers will travel?");
	 String time=enterString("Enter Time");
	 String requirements=enterString("Enter Requirements :For Examples(SMOKING-NO, PET-YES, LAGGUAGE-NO");
	 return "Your are from "+location+" "+"with"+passenger+" "+"passengers and with this reqirements"+
	 " "+requirements+" "+"in time"+" "+time; 
}
}
