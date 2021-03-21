package Util;

import java.util.Scanner;

import schoolManagament.Student;

public class InputUtil {
public static int enterInteger(String title)
{
	System.out.println(title);
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int operation=sc.nextInt();
	return operation;
	
}

public static String enterString(String title)
{
	System.out.println(title);
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	String answer=sc.nextLine();
	return answer;
	
}
public static Student fill() {
	
	String Name=InputUtil.enterString("Enter Your Name");
	String SurName=InputUtil.enterString("Enter Your SurName");
	String ClassName=InputUtil.enterString("Enter Your ClassName");
	int Age=InputUtil.enterInteger("Enter Your Age");
	return new Student(Name,SurName,ClassName,Age);

	
}
public static void main(String args[])
{
	
}
}
