package encapsulationAssignment;

import java.time.LocalDate;

public class Customer {
	
	
	private String name;
	private int id;
	private LocalDate dob;
	private String desc;
	
	
	public Customer() {
		
	}
	
	public Customer(String name, int id, LocalDate dob, String desc) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}
