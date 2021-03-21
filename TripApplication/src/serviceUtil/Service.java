package serviceUtil;

import java.util.LinkedList;

import main.Cities;
import util.Util;

public class Service {
public static void menu1() throws Exception{
	String info=Util.fillInfo();
	 System.out.println(info);
	 System.out.println("Welcome..");
    String city=Util.enterString("Where do you Want to go..");
    String toUpperCity=city.toUpperCase();
    
    System.out.println("checking Destinations for"+"  "+toUpperCity);
    Thread.sleep(2000);
    Cities cities1=new Cities();
    LinkedList<String> list=cities1.getList();
    if(list.contains(toUpperCity))
    {
   	 System.out.println("This are available trips for"+city+"...");
   	 String tripinfo=Util.fillTripInfo();
   	 System.out.println(tripinfo);
    }
    else
    {
   	 System.out.println("There are no available Trips\n\t Here are the Active Trips");
   	 Cities cities2=new Cities();
     LinkedList<String> list1=cities2.getList();
   	 
   	 for(String s : list1)
   	 System.out.println(s);
    }
    
}    
 public static void menu2()
    {
    	String info=Util.fillInfo();
   	 System.out.println(info);
   	 String CarType=Util.enterString("Enter Your Car type");
   	 String PlaceFrom=Util.enterString("Your Current Loaction");
   	 String PlaceTo=Util.enterString("Where do you ride?");
   	 int Capacity=Util.enterInteger("How many passengers you can cary?");
   	 String Requirements=Util.enterString("Enter Requirements: for Example: AC, MUSIC");
   	 System.out.println("CarType"+"  "+CarType+"\n"+"PlaceFrom"+"  "+PlaceFrom+"\n"+"PlaceTo"+"  "+
   			 PlaceTo+"\n"+"Capacity"+"  "+Capacity+"\n"+"Requirements"+"  "+Requirements);
    }

 public static void main3()
 {
	 System.out.println("Hello ,Welcome"+"\n"+"We provides You Vehice");
 }
}
