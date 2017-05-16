package com.deeps.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aryobj = new ArrayList<String>();
		ArrayList<String> arycpy = new ArrayList<String>();
		
		aryobj.add("Saradha");
		aryobj.add("Gayathri");
		aryobj.add("Deepa");
		
       System.out.println("Arraylist.main()");

		System.out.println("List of array items:"+aryobj);

//for (int i=0;i<3;i++)
		arycpy.addAll(aryobj);

		System.out.println("Copied Array list:"+arycpy);

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		System.out.println("Advanced For Loop"); 		
		for (int num : arrlist) { 		      
		     System.out.println(num); 		
		}

		ArrayList<Integer> aryint=new ArrayList<Integer>(); 
		aryint.add(2);
		aryint.add(4);
		aryint.add(6);
		
		for(int num:aryint){
			System.out.println(num); 				 
		}


		ArrayList<String> listofcountries = new ArrayList<String>();
		listofcountries.add("India");
		listofcountries.add("US");
		listofcountries.add("China");
		listofcountries.add("Denmark");

		System.out.println("Before Sorting:");
		for(String counter: listofcountries){
			System.out.println(counter);
		}
		
		Collections.sort(listofcountries);

		System.out.println("After Sorting:");
		for(String counter: listofcountries){
				System.out.println(counter);
		}
		
		 /* Sorting in decreasing order*/
		 Collections.sort(listofcountries, Collections.reverseOrder());

		 /* Sorted List in reverse order*/
		 System.out.println("ArrayList in descending order:");
		 for(String str: listofcountries){
				System.out.println(str);}
		
		}

}