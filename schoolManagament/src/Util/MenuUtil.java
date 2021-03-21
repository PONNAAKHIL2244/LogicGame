package Util;

import schoolManagament.Config;
import schoolManagament.Student;

public class MenuUtil {
public static void printallStudents() {
	if(Config.students==null)
	{
		System.out.println("You dont have any students");
	}
	System.out.println("Students that you have registered");
	for(int i=0;i<Config.students.length;i++)
	{
		Student st=Config.students[i];
		System.out.println("Student No: "+(i+1)+"\n"+st.getInfo());
	}
	
}

public static void Registration() {
	int count=InputUtil.enterInteger("How many students will you register");
    Config.students=new Student[count];
    for(int i=0;i<count;i++)
    {
    	System.out.println((i+1)+" "+"Registration"+"\n");
	Student st=InputUtil.fill();
    Config.students[i]=st;
    }
 }

public static void Find()
{
	String find=InputUtil.enterString("Enter Name or SurName You want find");
	for(int i=0;i<Config.students.length;i++)
	{
		Student st=Config.students[i];
		if(st.getName().equalsIgnoreCase(find) || st.getSurName().equalsIgnoreCase(find))
		{
			System.out.println(st.getInfo());
		}
	}
}
public static void updateStudent() {
	int student_place=InputUtil.enterInteger("In which string you want to do update");
	 System.out.println("Enter new Info");
	 Student st=InputUtil.fill();
	 Config.students[student_place-1]=st;
}
}