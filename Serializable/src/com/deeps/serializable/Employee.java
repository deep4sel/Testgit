package com.deeps.serializable;

public class Employee implements java.io.Serializable {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 3759900009549800810L;
	public String name;
	   public String address;
	   public  int SSN;
	   public int number;
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	

}
