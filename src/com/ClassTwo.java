package com;

public class ClassTwo extends ClassOne {
	String stringFromClassTwo;	//	instance variable from class two
	
	//	Use "Constructor" of class Two
	ClassTwo(String stringFromClassTwo){
		this.stringFromClassTwo = stringFromClassTwo;	//	Use of "this" keyword where setting of parameter value to class instance variable
	}
	
	//	Display Method of class two
	public void display(){
		System.out.println("String value from Class Two - " + stringFromClassTwo);
		super.display();	//	Use of "super" keyword and Calling the display method of Class one
	}
	
	public static void main(String[] args) {
		ClassTwo classTwo = new ClassTwo("ClassTwo");	//	Creating the object of Class two and passing the parameter value
		
		classTwo.display();	//	Calling the display method of Class two which in turn calls display method of Class one and both the method will display the 
							//	value of the instance string variable in their respective classes.
	}

}
