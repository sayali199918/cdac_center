//ToDo: Create a Class called CDACCenter which has ID, Name, Location, Address, Coordinator. Develop an app that will take inputs from the user to create objects of Center and locations to be in Bangalore, Pune, Mumbai, Hyderabad, Chennai. U should create an Array of Center of size 5. U should allow the user to set the values to these Centers and then display the details on the Console.  

package com.CDAC.Cdac_Center;
import java.util.*;
public class CenterDemo {
	String name;
	int id;
	String location;
	String address;
	String cordinator;
	
	void Getdata(CenterDemo a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		a.name=sc.next();
		System.out.println("Enter the ID");
		a.id=sc.nextInt();
		System.out.println("Enter the location");
		a.location=sc.next();
		System.out.println("Enter the address");
		a.address=sc.next();
		System.out.println("Enter the cordinator");
		a.cordinator=sc.next();
	}
	void Display(CenterDemo a)
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(location);
		System.out.println(address);
		System.out.println(cordinator);
		
	}
}
