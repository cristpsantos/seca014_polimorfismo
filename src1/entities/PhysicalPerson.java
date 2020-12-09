package entities;

public class PhysicalPerson extends Person {

	private Double healthExpenses;
	
	public PhysicalPerson() {
		super();
	}
	
	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}
	
	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double taxCalculation() {
		Double total = 0.0;
		if(getAnnualIncome() < 20000.00) {
			total = getAnnualIncome() * 0.15;
		}
		else if(getAnnualIncome() >= 20000.00 && healthExpenses > 0) {
			total = (getAnnualIncome() * 0.25) - (healthExpenses * 0.50);
		}
		else {
			total = getAnnualIncome() * 0.25;
		}
		return total;
	}

}
