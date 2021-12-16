package TestPackage;

import java.time.LocalDate;

import encapsulationAssignment.Customer;

public class TestEncap {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setName("Gokul");
		c.setId(12);
		c.setDob(LocalDate.of(1998,9, 16));
		c.setDesc("jdadsc kcbacbk");
		
		
		System.out.println("Name		:"+c.getName());
		System.out.println("Id		:"+c.getId());
		System.out.println("Date Of Birth	:"+c.getDob());
		System.out.println("Description 	:"+c.getDesc());
		
		

	}

}
