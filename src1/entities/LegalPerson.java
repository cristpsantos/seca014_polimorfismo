package entities;

public class LegalPerson extends Person {

	private Integer employeeNumber;
	
	public LegalPerson() {
		super();
	}
		
	public LegalPerson(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}
	
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public double taxCalculation() {
		Double total = 0.0;
		if(employeeNumber > 10) {
			total = getAnnualIncome() *  0.14;
		}
		else {
			total = getAnnualIncome() * 0.16;
		}
		return total;

	}


	
	
}
