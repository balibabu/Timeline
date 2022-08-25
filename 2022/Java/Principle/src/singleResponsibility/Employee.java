package singleResponsibility;
/*
Reasons to change:
1. Change in Employee Attribute
2. Changes in Database				: in save()
3. Changes in Tax Calculation		: in calculateTax()
After creating 2 class we have only one reason for change
*/

public class Employee {
	private String employeeId;
	private String employeeName;
	private String employeeAddress;
	
	public void save() {
		new EmployeeRepository().save(this);
	}
	
	public void calculateTax() {
		new TaxCalculator().calculateTax(this);
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
}
