package com.tnsif.shoppingmall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class ClothesSection {
	String[] mens={"Shoes","Tees","Shorts"};
	String[] womens ={"Sandals","Tops","Shorts"};
	String[] kids={"Frocks","Shoes","Pants"};	
}

class FoodSection{
	String[] indian={"Briyani","Paneer","Roti"};
	String[] western={"Burger","Pizza","Pasta"};
	String[] korean={"Japchae","Ramyoen","Kimchi"};
}

public class Mall {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter 1 for Clothes and 2 for Food");
		String input=obj.nextLine() ;
		
	switch((input)){  
		    //Case statements  
		    case "1" : 
		    	Scanner obj1= new Scanner(System.in);
		    	System.out.println("Do want to shop from Mens,Womens or Kids Section "); 
				String input1=obj1.nextLine() ;
				switch((input1)) {
				case "Mens":
					Scanner obj3= new Scanner(System.in);
					System.out.println("Do want Sandals,Tops,Shorts ");
					String input2=obj3.nextLine() ;
					System.out.println("You are buying "+input2);
				case "Women":
					Scanner obj4= new Scanner(System.in);
					System.out.println("Do want Shoes, Tees, Shorts ");
					String input3=obj4.nextLine() ;
					System.out.println("You are buying "+input3);
					
				case "Kids":
					Scanner obj5= new Scanner(System.in);
					System.out.println("Do want Frocks,Shoes,Pants ");
					String input4=obj5.nextLine() ;
					System.out.println("You are buying "+input4);
				}    
		    break;  
		    case "2": System.out.println("2");  
		    break;  
		    //Default case statement  
		    default:System.out.println("Wrong Input");  
		    }  

	}

	
}
