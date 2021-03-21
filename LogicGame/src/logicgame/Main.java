package logicgame;

import java.util.Random;
import java.util.Scanner;

public class Main {
public static void main(String args[])
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);

System.out.println("Welcome to bulls and cows Game");
System.out.println("This is a logical mind game"+
"\nHere B means one of your guessing number is inside the hidden number and is the right place" +
"\nHere C means one of your guessing number is inside the hidden number and is the wrong  place");


Random random=new Random();
int intRandom=random.nextInt(99);
//System.out.println("This is a Random Value:"+intRandom);
System.out.println("Enter your guess");
while(intRandom<11)
{
	intRandom++;
}

String s=String.valueOf(intRandom);

/*convert int to string
System.out.println(s.getClass()+" "+s);*/
//Here we convert two level to different numbers

char c1=s.charAt(0);
//System.out.println("First Number of  hidden Number:"+c1);

char c2=s.charAt(1);
//System.out.println("Second Number of hidden Number:"+c2);

while(true)
{
	if(c1==c2) {
		c1++;
}
// Here we getting input and output

String strrandom=sc.nextLine();

int input=Integer.parseInt(strrandom);

if(input<10)
{
	System.out.println("You entered one level NUmber,please enter two level number");
	continue ;
}

char charInput1=strrandom.charAt(0);
char charInput2=strrandom.charAt(1);


if(input==intRandom)
{
	System.out.println("Congratulations");
	System.out.println("This is a Random Value:"+intRandom);
	return;
}

else if(c1==charInput1  || c2==charInput2)
{
	System.out.println("1B , 0C");
}
else if(c1==charInput2  && c2==charInput1)
{
	System.out.println("0B , 2C");
	
}
else if(c1==charInput2 || c2==charInput1)
{
	System.out.println("0B , 1C");
}
else
{
	System.out.println("0B , 0C");
}


}

}
}
