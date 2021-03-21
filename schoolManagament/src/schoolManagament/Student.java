package schoolManagament;

public class Student {
	private String Name;
	private String SurName;
	private String ClassName;
	private int age;
	private int balance=0;


	public Student()

	{
		
	}
	public Student(String name, String surName, String className, int age) {
		super();
		Name = name;
		SurName = surName;
		ClassName = className;
		this.age = age;
		
	}



	public Student(String name, String surName, String className, int age, int balance) {
		super();
		Name = name;
		SurName = surName;
		ClassName = className;
		this.age = age;
		this.balance = balance;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getSurName() {
		return SurName;
	}


	public void setSurName(String surName) {
		SurName = surName;
	}


	public String getClassName() {
		return ClassName;
	}


	public void setClassName(String className) {
		ClassName = className;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Student [Name=" + Name +"\n"+ 
	" SurName=" + SurName +"\n"+
	" ClassName=" + ClassName +"\n"+
	" age=" + age+"\n"+
    " balance=" + balance +"\n"+ "]";
	}
	
	public String getInfo()
	{
		return "Name: "+getName()+ "\n"+ "Surname: "+getSurName()+"\n" +"ClassName: "+getClassName()+"\n"+
	"Age: "+getAge()+"\n";
		
	}
	
	
}
