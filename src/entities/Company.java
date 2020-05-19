package entities;

public class Company extends TaxPayer{

	private Integer employeeNumber;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double income, Integer employeeNumber) {
		super(name, income);
		this.employeeNumber = employeeNumber;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double Tax() {
		if(employeeNumber > 10) {
			return income * 0.14;
		}
		return income * 0.16;
	}

}
