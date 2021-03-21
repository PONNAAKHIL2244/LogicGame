package schoolManagament;

import Util.InputUtil;
import Util.Email;
import Util.MenuUtil;

public class Main {
	public static void main(String args[])
	{
		while(true)
		{
		System.out.println("Welcome to Student Operation Center");
		int operation=InputUtil.enterInteger("What DO You Want To Do?"+
				"\n1:Register Student " +
				"\n2.Show all Students " +
				"\n3.Find Student "+
				"\n4:Update Student"+
				"\n5:Create Email"+
				"\n0:Quit");
		
		if(operation==1)
		   {
			MenuUtil.Registration();
		   }
		else if(operation==2)
			 {
			   MenuUtil.printallStudents();
		     }
		else if(operation==3)
		{
			MenuUtil.Find();
		}
		else if(operation==4)
		{
		MenuUtil.updateStudent();
		 
		}
		else if(operation==5)
				
 			{  
			Student student=InputUtil.fill();
				
				Email email=new Email(student.getName(),student.getSurName());
				System.out.println(email);
			}
		else if(operation==0)
		{
			System.out.println("Quiting");
			break;
		}
		else
		{
			System.out.println("Invalid Operation");
			break;
		}
    }
  }
}