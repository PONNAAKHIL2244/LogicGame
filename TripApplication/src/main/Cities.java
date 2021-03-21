package main;

import java.util.LinkedList;

public class Cities {

	LinkedList<String> list=new LinkedList<>();
	public Cities() {
		
	}
	
	public LinkedList<String> getList(){
		list.add("HYDERABAD");
		list.add("GOA");
		list.add("MUMBAI");
		list.add("DELHI");
		list.add("PUNE");
		list.add("KOCHI");
		list.add("WARANGAL");
		list.add("BANGLORE");
		list.add("KERALA");
		list.add("TAMILNADU");
		System.out.println("\n");
		return list;
	}
	
}
