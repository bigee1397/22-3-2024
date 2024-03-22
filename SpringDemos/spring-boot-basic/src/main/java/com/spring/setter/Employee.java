package com.spring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("Bhargav")
	private String empName;
	@Value("303099")
	private Integer empId;
	@Autowired
	private Address address;
	
	public Employee() {
		super();
	}
	
	public Employee(String empName, Integer empId, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", address=" + address + "]";
	}

	
	
}
