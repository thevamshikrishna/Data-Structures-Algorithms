//package Encapsulation;

//import java.util.*;

public class support{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return age;
	}
	
	public support(String name,int age){
		this.name=name;
		this.age=age;
		
		System.out.println("Hero Name is: "+getName()+" and Age is "+getAge());
	}
}