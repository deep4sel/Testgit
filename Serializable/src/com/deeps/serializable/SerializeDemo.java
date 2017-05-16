package com.deeps.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author abihilash_janesh
 *
 */
public class SerializeDemo {

	public static void main(String[] args) {
		 List<Employee> lstEmploee = new ArrayList();
		 
		 Employee lvEmploee = new Employee();
		 lvEmploee.name = "Reyan Ali";
		 lvEmploee.address = "Phokka Kuan, Ambehta Peer";
		 lvEmploee.SSN = 11122333;
		 lvEmploee.number = 101;
	      
	      lstEmploee.add(lvEmploee);
	      
	      lvEmploee = new Employee();
			 lvEmploee.name = "Ram";
			 lvEmploee.address = "Siva";
			 lvEmploee.SSN = 112222333;
			 lvEmploee.number = 102;
		      
		   lstEmploee.add(lvEmploee);
		      
	      try {
	         FileOutputStream fileOut = new FileOutputStream("/tmp/employee.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.write(lstEmploeee);
	         
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.txt");
	      }catch(IOException i) {
	         i.printStackTrace();
	      }
	}

}

